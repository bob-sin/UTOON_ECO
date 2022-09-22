select * FROM board order by idx desc;

create table board(
	idx number not null,
	title varchar2(100) not null,
	content varchar2(2000) not null,
	writer varchar2(20) not null,
	indate date default sysdate,
	count number default 0,
	primary key(idx)
);

create sequence idx_seq;

insert into board(idx, title, content, writer)
values(idx_seq.nextval, '게시판연습1', '게시판연습1', '관리자');
insert into board(idx, title, content, writer)
values(idx_seq.nextval, '게시판연습2', '게시판연습2', '박근성');
insert into board(idx, title, content, writer)
values(idx_seq.nextval, '게시판연습3', '게시판연습3', '엄태구');

create table memtbl(
	memId varchar(30) not null,
	memPwd varchar(30) not null,
	memName varchar(30) not null,
	primary key(memId)
);

insert into memtbl
values('smhrd01', 'smhrd01', '관리자');
insert into memtbl
values('smhrd02', 'smhrd02', '박근성');
insert into memtbl
values('smhrd03', 'smhrd03', '엄태구');

select * from memtbl;

create table myboard(
	idx number not null,
	memId varchar(30) not null, -- 회원아이디 추가
	title varchar2(100) not null,
	content varchar2(2000) not null,
	writer varchar2(20) not null,
	indate date default sysdate,
	count number default 0,
	primary key(idx)
);
















