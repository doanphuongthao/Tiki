$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/BTVN_buoi4/BuyTiki.feature");
formatter.feature({
  "name": "Gio hang",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Kiem tra mua san pham tren tiki",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Hien thi giao dien trang chu tiki",
  "keyword": "Given "
});
formatter.match({
  "location": "BTVN_buoi4.StepDefinitions.hien_thi_giao_dien_trang_chu_tiki()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Nguoi dung chon mua san pham bat ky",
  "keyword": "When "
});
formatter.match({
  "location": "BTVN_buoi4.StepDefinitions.nguoi_dung_chon_mua_san_pham_bat_ky()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Nguoi dung click chon kiem tra gio hang",
  "keyword": "And "
});
formatter.match({
  "location": "BTVN_buoi4.StepDefinitions.nguoi_dung_click_chon_kiem_tra_gio_hang()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "San pham chon mua da duoc them vao trong gio hang",
  "keyword": "Then "
});
formatter.match({
  "location": "BTVN_buoi4.StepDefinitions.san_pham_chon_mua_da_duoc_them_vao_trong_gio_hang()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});