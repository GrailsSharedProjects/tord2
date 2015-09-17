package com.tord.admin

import com.tord.Article
import com.tord.TDomainOperations
import com.tord.Work

class FooterModule implements TDomainOperations{
	String name
	
	String title
	String type
	String contentHTML
	
	static constraints = {
		name unique: true
		title()
		type inList: ['html', 'contact',
			'recent-post', 'recent-portfolio', 
			'recent-project', 'recent-work']
		contentHTML nullable: true, blank: true, widget: 'textarea'
	}

	static mapping = {
		contentHTML type: 'text'
	}

	@Override
	public String toString() {
		"${name}"
	}
	
	public List<Article> getRecentArticles(){
		Article.list([max: 3, sort: 'lastUpdated', order: 'desc']);
	}
	
	public List<Work> getRecentWorks(){
		Work.list([max: 6, sort: 'lastUpdated', order: 'desc']);
	}
	
	public List<Work> getRecentPortfolio(){
		Work.findAllByCategory('portfolio', [max: 6, sort: 'lastUpdated', order: 'desc']);
	}
	
	public List<Work> getRecentProjects(){
		Work.findAllByCategory('project', [max: 6, sort: 'lastUpdated', order: 'desc']);
	}
}
