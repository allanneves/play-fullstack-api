# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  code                          varchar(255),
  type                          varchar(255),
  description                   varchar(255),
  price                         decimal(38),
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists product;

