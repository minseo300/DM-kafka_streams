package com.cdc.impl;


import com.cdc.impl.kafka.BookmarkDemoRepository;
import com.cdc.impl.kafka.Bookmark_demo;
import com.fasterxml.jackson.core.JsonParser;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

@SpringBootApplication
@RequiredArgsConstructor
public class ImplApplication {

	private final Logger logger= LoggerFactory.getLogger(ImplApplication.class);
	private final BookmarkDemoRepository bookmarkDemoRepository;
	JSONParser jsonParser = new JSONParser();

	@KafkaListener(topics = "post.post.bookmark", groupId = "comfy")
	public void bookmarkConsume(String message) throws IOException, ParseException {
		//2. Parser

		//3. To Object
		Object obj = jsonParser.parse(message);

		//4. To JsonObject
		JSONObject jsonObj = (JSONObject) obj;
		JSONObject data=(JSONObject) jsonObj.get("payload");
		logger.info("[Bookmark] : {}",jsonObj.get("payload"));
		logger.info("[Bookmark data getClass]: {}",data.getClass());
		Bookmark_demo bookmark_demo=new Bookmark_demo();
		bookmark_demo.setId((Long)data.get("id"));
		bookmark_demo.setMemberId((Long)data.get("member_id"));
		bookmark_demo.setPostId((Long)data.get("post_id"));

		bookmarkDemoRepository.save(bookmark_demo);
	}
//	@KafkaListener(topics = "member", groupId = "comfy")
//	public void memberConsume(String message) throws IOException, ParseException {
//		//2. Parser
//
//		//3. To Object
//		Object obj = jsonParser.parse(message);
//
//		//4. To JsonObject
//		JSONObject jsonObj = (JSONObject) obj;
//
//		String queryCase=jsonObj.get("op").toString();
//		if(queryCase.equals("c")){ // insert
//
//		}
//		else if(queryCase.equals("u")){ // update
//
//		}
//		else if(queryCase.equals("d")){ // delete
//
//		}
//		System.out.println(String.format("Consumed message : %s", jsonObj.get("payload")));
//	}
	public static void main(String[] args) {
		SpringApplication.run(ImplApplication.class, args);
	}

}
