databaseChangeLog = {

	changeSet(author: "Wicky (generated)", id: "1441107460971-1") {
		createTable(tableName: "article") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "contenthtml", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title_photo_id", type: "BIGINT")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-2") {
		createTable(tableName: "contact") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "VARCHAR(255)")

			column(name: "email", type: "VARCHAR(255)")

			column(name: "facebook", type: "VARCHAR(255)")

			column(name: "land_line", type: "VARCHAR(255)")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "phone", type: "VARCHAR(255)")

			column(name: "qq", type: "VARCHAR(255)")

			column(name: "twitter", type: "VARCHAR(255)")

			column(name: "weibo", type: "VARCHAR(255)")

			column(name: "weixin", type: "VARCHAR(255)")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-3") {
		createTable(tableName: "footer") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "module1_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "module2_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "module3_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "module4_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-4") {
		createTable(tableName: "footer_module") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "contenthtml", type: "VARCHAR(255)")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "VARCHAR(16)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-5") {
		createTable(tableName: "header") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "style", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-6") {
		createTable(tableName: "menu") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "action", type: "VARCHAR(255)")

			column(name: "controller", type: "VARCHAR(255)")

			column(name: "group_id", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "header_id", type: "BIGINT")

			column(name: "icon", type: "VARCHAR(255)")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "parent_id", type: "BIGINT")

			column(name: "style", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "url", type: "VARCHAR(255)")

			column(name: "sub_menus_idx", type: "INT")

			column(name: "menu_idx", type: "INT")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-7") {
		createTable(tableName: "msg") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "file_path", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "msg", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "success", type: "BIT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-8") {
		createTable(tableName: "page") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "custom_css", type: "VARCHAR(255)")

			column(name: "custom_java_script", type: "VARCHAR(255)")

			column(name: "description", type: "VARCHAR(255)")

			column(name: "layout_name", type: "VARCHAR(8)")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "slider_revolution_id", type: "BIGINT")

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-9") {
		createTable(tableName: "photo") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "VARCHAR(255)")

			column(name: "original_file_name", type: "VARCHAR(255)")

			column(name: "url", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-10") {
		createTable(tableName: "product") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-11") {
		createTable(tableName: "registration_code") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "date_created", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "token", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-12") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-13") {
		createTable(tableName: "site_settings") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "data_key", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "data_val", type: "LONGTEXT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-14") {
		createTable(tableName: "slider") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "bg_image_id", type: "BIGINT")

			column(name: "bg_image_alt", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "row1", type: "VARCHAR(255)")

			column(name: "row2", type: "VARCHAR(255)")

			column(name: "row3", type: "VARCHAR(255)")

			column(name: "row4", type: "VARCHAR(255)")

			column(name: "row5", type: "VARCHAR(255)")

			column(name: "style", type: "INT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-15") {
		createTable(tableName: "slider_revolution") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-16") {
		createTable(tableName: "slider_revolution_slider") {
			column(name: "slider_revolution_sliders_id", type: "BIGINT")

			column(name: "slider_id", type: "BIGINT")

			column(name: "sliders_idx", type: "INT")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-17") {
		createTable(tableName: "tag_links") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "tag_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "tag_ref", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-18") {
		createTable(tableName: "tags") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-19") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-20") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-21") {
		createTable(tableName: "widget") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "category", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "contenthtml", type: "VARCHAR(255)")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "photo_id", type: "BIGINT")

			column(name: "ref_action", type: "VARCHAR(255)")

			column(name: "ref_controller", type: "VARCHAR(255)")

			column(name: "ref_text", type: "VARCHAR(255)")

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-22") {
		createTable(tableName: "work") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "category", type: "VARCHAR(9)") {
				constraints(nullable: "false")
			}

			column(name: "contenthtml", type: "LONGTEXT") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "product_id", type: "BIGINT")

			column(name: "show_on_home_page", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "title_photo_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "title_photo_alt", type: "VARCHAR(255)")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-23") {
		createTable(tableName: "work_photo") {
			column(name: "work_gallery_photo_list_id", type: "BIGINT")

			column(name: "photo_id", type: "BIGINT")

			column(name: "gallery_photo_list_idx", type: "INT")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-24") {
		addPrimaryKey(columnNames: "role_id, user_id", tableName: "user_role")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-42") {
		createIndex(indexName: "UK_9yh3uidjj6cnugskaogt626d5", tableName: "article", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-43") {
		createIndex(indexName: "UK_8egib4wq2lnsm6u7noysivln2", tableName: "contact", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-44") {
		createIndex(indexName: "UK_bbbnx4nnjjdpa73n90t0w7kmr", tableName: "footer", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-45") {
		createIndex(indexName: "UK_keyyejxwg967chml1ux3wyvhq", tableName: "footer_module", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-46") {
		createIndex(indexName: "UK_f2cn49v393twr1uba72hc5jvp", tableName: "header", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-47") {
		createIndex(indexName: "UK_m05sb1hgsv38qjb4ksyh5eat2", tableName: "menu", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-48") {
		createIndex(indexName: "UK_95ym838ld50rfdvg1yeixonfw", tableName: "page", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-49") {
		createIndex(indexName: "UK_kigvc1s15qmrka7nuw4nfpgnk", tableName: "photo", unique: "true") {
			column(name: "url")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-50") {
		createIndex(indexName: "UK_jmivyxk9rmgysrmsqw15lqr5b", tableName: "product", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-51") {
		createIndex(indexName: "UK_irsamgnera6angm0prq1kemt2", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-52") {
		createIndex(indexName: "UK_cpwghyr9xkim07y7q6scog1pf", tableName: "slider", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-53") {
		createIndex(indexName: "UK_cyd2o9gsbaoaa0numhgqm4qii", tableName: "slider_revolution", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-54") {
		createIndex(indexName: "UK_t48xdq560gs3gap9g7jg36kgc", tableName: "tags", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-55") {
		createIndex(indexName: "UK_sb8bbouer5wak8vyiiy4pf2bx", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-56") {
		createIndex(indexName: "UK_4epb6m2lav5g7x3s8t0uqdovn", tableName: "widget", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-57") {
		createIndex(indexName: "UK_7po25hc1hi3nggvseu7l2mnw3", tableName: "work", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-25") {
		addForeignKeyConstraint(baseColumnNames: "title_photo_id", baseTableName: "article", baseTableSchemaName: "tord", constraintName: "FK_bwqrh91scldhy6qyse3expsax", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "photo", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-26") {
		addForeignKeyConstraint(baseColumnNames: "module1_id", baseTableName: "footer", baseTableSchemaName: "tord", constraintName: "FK_aku534ml3yocn9gyc9g1sl7og", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "footer_module", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-27") {
		addForeignKeyConstraint(baseColumnNames: "module2_id", baseTableName: "footer", baseTableSchemaName: "tord", constraintName: "FK_84uwiunlalw0wwhi6pgmybmpt", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "footer_module", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-28") {
		addForeignKeyConstraint(baseColumnNames: "module3_id", baseTableName: "footer", baseTableSchemaName: "tord", constraintName: "FK_d6446lispfgc38ewtkmglssw8", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "footer_module", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-29") {
		addForeignKeyConstraint(baseColumnNames: "module4_id", baseTableName: "footer", baseTableSchemaName: "tord", constraintName: "FK_3oje8l2a37xs7luc9xe0kkxfw", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "footer_module", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-30") {
		addForeignKeyConstraint(baseColumnNames: "header_id", baseTableName: "menu", baseTableSchemaName: "tord", constraintName: "FK_441k00ef99rtpoykpv0rkprct", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "header", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-31") {
		addForeignKeyConstraint(baseColumnNames: "parent_id", baseTableName: "menu", baseTableSchemaName: "tord", constraintName: "FK_98a0njtu1xt51ul6g3v0ptj8b", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "menu", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-32") {
		addForeignKeyConstraint(baseColumnNames: "slider_revolution_id", baseTableName: "page", baseTableSchemaName: "tord", constraintName: "FK_cp5s0y0favhyjt3bnb7n3ivy9", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "slider_revolution", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-33") {
		addForeignKeyConstraint(baseColumnNames: "bg_image_id", baseTableName: "slider", baseTableSchemaName: "tord", constraintName: "FK_lb5fqe0vaqsops61dn3it9e3f", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "photo", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-34") {
		addForeignKeyConstraint(baseColumnNames: "slider_id", baseTableName: "slider_revolution_slider", baseTableSchemaName: "tord", constraintName: "FK_g89f2hn5f0akglottiodbpkr0", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "slider", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-35") {
		addForeignKeyConstraint(baseColumnNames: "tag_id", baseTableName: "tag_links", baseTableSchemaName: "tord", constraintName: "FK_lmil1jg72pjc8ei5p6kk5g9un", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "tags", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-36") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", baseTableSchemaName: "tord", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "role", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-37") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", baseTableSchemaName: "tord", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "user", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-38") {
		addForeignKeyConstraint(baseColumnNames: "photo_id", baseTableName: "widget", baseTableSchemaName: "tord", constraintName: "FK_55ljh5fcf6e4gidutym6drg5p", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "photo", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-39") {
		addForeignKeyConstraint(baseColumnNames: "product_id", baseTableName: "work", baseTableSchemaName: "tord", constraintName: "FK_lh9mw4dk7u4g7mprlplb6lyoo", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "product", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-40") {
		addForeignKeyConstraint(baseColumnNames: "title_photo_id", baseTableName: "work", baseTableSchemaName: "tord", constraintName: "FK_ivk44lbjm17qsh8n4unaooa15", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "photo", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}

	changeSet(author: "Wicky (generated)", id: "1441107460971-41") {
		addForeignKeyConstraint(baseColumnNames: "photo_id", baseTableName: "work_photo", baseTableSchemaName: "tord", constraintName: "FK_hqs22cd9shjxd69byvcv13pyr", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "photo", referencedTableSchemaName: "tord", referencesUniqueColumn: "false")
	}
}
