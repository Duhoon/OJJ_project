-- 그룹/조직/부서 구조도
CREATE TABLE CIP_ORGANIZATION
(
	-- 조직 일련번호
	ORGANIZATION_SEQ varchar(50) NOT NULL COMMENT '조직 일련번호',
	-- 명칭
	NAME varchar(1000) NOT NULL COMMENT '명칭',
	-- 대표 전화번호
	TELEPHONE varchar(40) COMMENT '대표 전화번호',
	-- 정렬순서
	ORDER_NUMBER decimal COMMENT '정렬순서',
	-- 상위 조직 일련번호
	PARENT_ORGANIZATION_SEQ varchar(50) COMMENT '상위 조직 일련번호',
	CONSTRAINT PK_ORGANIZATION PRIMARY KEY (ORGANIZATION_SEQ)
) COMMENT = '그룹/조직/부서 구조도';

CREATE TABLE home
(
    ID        VARCHAR(45)    NOT NULL    COMMENT '아이디', 
    PASSWORD  VARCHAR(45)    NOT NULL    COMMENT '비밀번호', 
    NAME      VARCHAR(45)    NOT NULL    COMMENT '이름', 
    PRIMARY KEY (ID)
);

CREATE TABLE BOARD
(
	TITLE varchar(45) NOT NULL COMMENT '타이틀',
	BODY varchar(45) NOT NULL COMMENT '내용',
	NAME varchar(45) COMMENT '작성자',
	SEQ varchar(45) COMMENT '일련번호',
	PRIMARY KEY (SEQ)
) ;



