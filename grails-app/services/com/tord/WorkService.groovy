package com.tord

import grails.transaction.Transactional

@Transactional
class WorkService {

    def findAllByCategory(category) {
		Work.findAllByCategory(category);
    }
	
	def findByNameAndCategory(name, category) {
		Work.findByNameAndCategory(name, category);
	}
	
	def findAllTagsByCategory(category) {
		String findAllTags = """
		   SELECT distinct tagLinks.tag.name 
		   FROM Work work, org.grails.taggable.TagLink tagLinks 
		   WHERE work.id = tagLinks.tagRef 
		   AND work.category = '${category}'
		   AND tagLinks.type = 'work'
		"""
		Work.executeQuery(findAllTags);
	}
}
