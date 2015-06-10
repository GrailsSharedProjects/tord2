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
}
