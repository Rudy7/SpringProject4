select * from member;
select * from board;

CREATE table board(
	bbs_seq number primary key,
	title varchar2(20),
	content varchar2(1500),
	writedate date Default sysdate,
	view_count number,
	good number,
	userid varchar2(20),
	foreign key(userid) references member(userid) on delete cascade
);
create sequence bbsSeq start with 1;     

INSERT INTO board
VALUES(bbsSeq.nextval, 'test', 'test2', sysdate, '2', '2', 'jyw4891');

select * from user_sequences;
desc bbsSeq;

DROP table board;


select bbsSeq.currval from dual;
select bbsSeq.nextval from dual;


