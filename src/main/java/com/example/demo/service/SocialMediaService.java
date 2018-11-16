package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SocialMedia;
import com.example.demo.model.TeacherSocialMedia;

public interface SocialMediaService {
void saveSocialMedia(SocialMedia socialMedia);
	
	void deleteSocialMediaById(Long id);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
	SocialMedia findById(Long idSocialMedia);
	
	SocialMedia findByName(String name);
	
	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
}
