{"filter":false,"title":"InfoadminController.groovy","tooltip":"/grails-app/controllers/com/tord/admin/InfoadminController.groovy","undoManager":{"mark":49,"position":49,"stack":[[{"start":{"row":4,"column":0},"end":{"row":13,"column":0},"action":"remove","lines":["","\tdef afterInterceptor = [action: this.&applyPageData] ","\t","\tprivate applyPageData(model){","\t\tmodel.pageData = Page.findByName(\"ADMIN_PAGE\");","\t}","\t","    def index() {","\t}",""],"id":2}],[{"start":{"row":3,"column":28},"end":{"row":4,"column":0},"action":"insert","lines":["",""],"id":3},{"start":{"row":4,"column":0},"end":{"row":4,"column":1},"action":"insert","lines":["\t"]}],[{"start":{"row":4,"column":1},"end":{"row":4,"column":27},"action":"insert","lines":["\tstatic scaffold = Header;"],"id":4}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":17},"action":"remove","lines":["@artifact.package"],"id":5},{"start":{"row":0,"column":0},"end":{"row":0,"column":1},"action":"insert","lines":["c"]}],[{"start":{"row":0,"column":1},"end":{"row":0,"column":2},"action":"insert","lines":["o"],"id":6}],[{"start":{"row":0,"column":2},"end":{"row":0,"column":3},"action":"insert","lines":["m"],"id":7}],[{"start":{"row":0,"column":3},"end":{"row":0,"column":4},"action":"insert","lines":["."],"id":8}],[{"start":{"row":0,"column":4},"end":{"row":0,"column":5},"action":"insert","lines":["t"],"id":9}],[{"start":{"row":0,"column":5},"end":{"row":0,"column":6},"action":"insert","lines":["o"],"id":10}],[{"start":{"row":0,"column":6},"end":{"row":0,"column":7},"action":"insert","lines":["r"],"id":11}],[{"start":{"row":0,"column":7},"end":{"row":0,"column":8},"action":"insert","lines":["d"],"id":12}],[{"start":{"row":0,"column":8},"end":{"row":0,"column":9},"action":"insert","lines":["."],"id":13}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":1},"action":"insert","lines":["["],"id":14}],[{"start":{"row":0,"column":1},"end":{"row":0,"column":2},"action":"insert","lines":["a"],"id":15}],[{"start":{"row":0,"column":2},"end":{"row":0,"column":3},"action":"insert","lines":["v"],"id":16}],[{"start":{"row":0,"column":2},"end":{"row":0,"column":3},"action":"remove","lines":["v"],"id":17}],[{"start":{"row":0,"column":1},"end":{"row":0,"column":2},"action":"remove","lines":["a"],"id":18}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":1},"action":"remove","lines":["["],"id":19}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":1},"action":"insert","lines":["p"],"id":20}],[{"start":{"row":0,"column":1},"end":{"row":0,"column":2},"action":"insert","lines":["a"],"id":21}],[{"start":{"row":0,"column":2},"end":{"row":0,"column":3},"action":"insert","lines":["c"],"id":22}],[{"start":{"row":0,"column":3},"end":{"row":0,"column":4},"action":"insert","lines":["k"],"id":23}],[{"start":{"row":0,"column":4},"end":{"row":0,"column":5},"action":"insert","lines":["a"],"id":24}],[{"start":{"row":0,"column":5},"end":{"row":0,"column":6},"action":"insert","lines":["g"],"id":25}],[{"start":{"row":0,"column":6},"end":{"row":0,"column":7},"action":"insert","lines":["e"],"id":26}],[{"start":{"row":0,"column":7},"end":{"row":0,"column":8},"action":"insert","lines":[" "],"id":27}],[{"start":{"row":0,"column":17},"end":{"row":0,"column":18},"action":"insert","lines":["a"],"id":28}],[{"start":{"row":0,"column":18},"end":{"row":0,"column":19},"action":"insert","lines":["d"],"id":29}],[{"start":{"row":0,"column":19},"end":{"row":0,"column":20},"action":"insert","lines":["m"],"id":30}],[{"start":{"row":0,"column":20},"end":{"row":0,"column":21},"action":"insert","lines":["i"],"id":31}],[{"start":{"row":0,"column":21},"end":{"row":0,"column":22},"action":"insert","lines":["n"],"id":32}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":1},"action":"remove","lines":["@"],"id":33}],[{"start":{"row":4,"column":20},"end":{"row":4,"column":26},"action":"remove","lines":["Header"],"id":35}],[{"start":{"row":4,"column":20},"end":{"row":4,"column":21},"action":"insert","lines":["I"],"id":36}],[{"start":{"row":4,"column":21},"end":{"row":4,"column":22},"action":"insert","lines":["n"],"id":37}],[{"start":{"row":4,"column":22},"end":{"row":4,"column":23},"action":"insert","lines":["f"],"id":38}],[{"start":{"row":4,"column":23},"end":{"row":4,"column":24},"action":"insert","lines":["o"],"id":39}],[{"start":{"row":4,"column":1},"end":{"row":4,"column":2},"action":"remove","lines":["\t"],"id":40}],[{"start":{"row":6,"column":0},"end":{"row":12,"column":0},"action":"insert","lines":["package com.tord.admin","","","class MenuController {","\tstatic scaffold = Menu;","}",""],"id":42}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["package com.tord.admin",""],"id":43}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["",""],"id":44}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["",""],"id":45}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["class MenuController {",""],"id":46}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["\tstatic scaffold = Menu;",""],"id":47}],[{"start":{"row":6,"column":0},"end":{"row":7,"column":0},"action":"remove","lines":["}",""],"id":48}],[{"start":{"row":1,"column":16},"end":{"row":1,"column":26},"action":"remove","lines":["admin.Page"],"id":49},{"start":{"row":1,"column":16},"end":{"row":1,"column":17},"action":"insert","lines":["I"]}],[{"start":{"row":1,"column":17},"end":{"row":1,"column":18},"action":"insert","lines":["n"],"id":50}],[{"start":{"row":1,"column":18},"end":{"row":1,"column":19},"action":"insert","lines":["f"],"id":51}],[{"start":{"row":1,"column":19},"end":{"row":1,"column":20},"action":"insert","lines":["o"],"id":52}],[{"start":{"row":1,"column":0},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":53}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":7,"column":0},"end":{"row":7,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1442498551392,"hash":"d90cf560881c6843dab300c19e5b6236d2d399fa"}