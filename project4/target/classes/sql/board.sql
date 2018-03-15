select * from member;
select * from board;


CREATE table board(
	bbs_seq number primary key,
	title varchar2(20),
	writedate date Default sysdate,
	view_count number,
	good number,
	userid varchar2(20),
	foreign key(userid) references member(userid) on delete cascade
);
