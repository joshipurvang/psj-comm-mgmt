insert into LOGIN(login_id,username,password,create_by,created_date,update_by,update_date) 
values (10001,'psj','psj',10001,sysdate,10001,sysdate);

insert into Tenament(tenament_id,login_id,division,number,create_by,created_date,update_by,update_date)
values(20001,10001,'C','25',10001,sysdate,10001,sysdate);

insert into user(user_id,tenament_id,first_name,last_name,create_by,created_date,update_by,update_date) 
values (30001,20001,'purvang','joshi',10001,sysdate,10001,sysdate);

insert into vehicle(vehicle_id,tenament_id,vehicle_number,vehicle_type,create_by,created_date,update_by,update_date)
values (40001,20001,'be5523','4_wh',10001,sysdate,10001,sysdate);