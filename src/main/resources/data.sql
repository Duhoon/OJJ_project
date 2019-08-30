-- 그룹/조직/부서 구조도
insert into CIP_ORGANIZATION 
(ORGANIZATION_SEQ,NAME,TELEPHONE,ORDER_NUMBER,PARENT_ORGANIZATION_SEQ) 
SELECT 'UUID-11-CIP7','구매부','051-2260-3449',1, NULL FROM dual UNION ALL
SELECT 'UUID-11-CIPI9L','장비생산기술팀(시험평가)','051-2260-3430',1,'UUID-11-CIPI7S' FROM dual UNION ALL
SELECT 'UUID-11-CIPI9M','장비품질보증팀(개발품질)','051-2260-3436',1,'UUID-11-CIPI8I' FROM dual ;

insert into home
values('test_id','test_pw','test_name');
insert into home
values('hyun','9772','YuJin');


insert into BOARD
values('title_____','body_____','JECHAN','1');