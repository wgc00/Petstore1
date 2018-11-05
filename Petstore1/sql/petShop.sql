-- 用户表
create table User (
  user_id         int primary key     auto_increment,
  user_name       varchar(25),
  user_first_name varchar(15),
  user_last_name  varchar(20),
  user_email      varchar(20),
  user_password   varchar(20),
  user_phone      varchar(100),
  user_status     int  default 0
);
-- 0表示离线  1表示在线
insert into user (user_name, user_first_name, user_last_name, user_email, user_password, user_phone, user_status)
VALUE ("123", "李", "思明", "12345@.com", "123", "13457182233", default),
      ("333", "陈", "明", "345@.com", "111", "13457181133", default);

-- 宠物类别表
create table Category (
  category_id   int primary key auto_increment,
  category_name varchar(20)
);

insert into Category (category_name)
value ("猫"),
      ("狗");

-- 宠物表
create table Pet (
  pet_id      int primary key          auto_increment,
  category_id int references Category (category_id),
  pet_name    varchar(20),
  tas_id      int references Tag (tag_id),
  pet_status  enum ("可用", "待定", "已销售") default "可用"
);

insert into pet (category_id, pet_name, tas_id, pet_status)
VALUE (1, "波斯猫", 2, default),
      (2, "哈士奇", 3, default),
      (1, "白猫", 3, default);
-- 标签
create table Tag (
  tag_id   int primary key auto_increment,
  tag_name varchar(20)
);
insert into Tag (tag_name)
value ("宠物饰狗地址标签挂件"),
      ("宠物ID身份挂件"),
      ("注入芯片"),
      ("宠物名字吊牌刻名");

-- 照片表
create table photo (
  photo_id  int primary key auto_increment,
  photo_url varchar(100),
  pet_id    int references Pet (pet)
);

insert into photo (photo_url, pet_id)
VALUE ("D:\TwoAcademicYearProject\Petstore\img\cat.jsp", 1),
      ("D:\TwoAcademicYearProject\Petstore\img\dog.jsp", 2);

-- 宠物订单表
create table `Order` (
  order_id        int primary key         auto_increment,
  order_number    varchar(20),
  pet_id          int references Pet (pet_id),
  order_quantity  int,
  order_ship_date timestamp,
  order_status    enum ("放置", "批准", "交付") default "放置",
  order_complete  bool                    default false
);

insert into `order` (pet_id, order_quantity, order_status, order_complete)
value (1, 1000, default, default),
      (2, 9000, default, default);

-- 库存表
create table inventory (
  inventory_id           int primary key auto_increment,
  pet_id                 int references Pet (pet_id),
  inventory_quantity     int,
  inventory_deposit_date timestamp,
  inventory_price        decimal(18, 2)
);

insert into inventory (pet_id, inventory_quantity, inventory_price)
VALUE (1, 200, 200),
      (2, 300, 1000);

select * from inventory;
select * from `Order` o left join Pet p on o.pet_id = p.pet_id left join Tag T on p.tas_id = T.tag_id

select
       o.order_number,
       o.order_quantity,
       o.order_ship_date,
       o.order_status,
       o.order_complete,
       p.pet_name,
       p.pet_status,
       p.tas_id
from `order` o left join  pet p  on o.pet_id = p.pet_id