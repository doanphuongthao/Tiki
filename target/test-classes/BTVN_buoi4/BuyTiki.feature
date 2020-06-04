Feature: Gio hang
  Scenario: Kiem tra mua san pham tren tiki
    Given Hien thi giao dien trang chu tiki
    When Nguoi dung chon mua san pham bat ky
    And Nguoi dung click chon kiem tra gio hang
    Then San pham chon mua da duoc them vao trong gio hang