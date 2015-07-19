package com.tord

import grails.transaction.Transactional

@Transactional
class WorkService {

    def findAllByCategory(category) {
		def cate = WorkCategory.findByName(category);
		if(!cate) {
			cate = new WorkCategory(name: category).save(flush: true)
		}
		Work.findAllByCategory(cate);
    }
	
	def findByNameAndCategory(name, category) {
		def cate = WorkCategory.findByName(category);
		if(!cate) {
			cate = new WorkCategory(name: category).save(flush: true)
		}
		Work.findByNameAndCategory(name, cate);
	}
	
	def findAllTagsByCategory(category) {
		def cate = WorkCategory.findByName(category);
		if(!cate) {
			cate = new WorkCategory(name: category).save(flush: true)
		}
		
		String findAllTags = """
		   SELECT distinct tagLinks.tag.name 
		   FROM Work work, org.grails.taggable.TagLink tagLinks 
		   WHERE work.id = tagLinks.tagRef 
		   AND work.category = ${cate.id}
		   AND tagLinks.type = 'work'
		"""
		
		Work.executeQuery(findAllTags);
	}
}
