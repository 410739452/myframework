DROP TABLE IF EXISTS "users";

CREATE TABLE "users"
(
  id bigint NOT NULL, -- 主键ID
  name text, -- 姓名
  age integer, -- 年龄
  email text, -- 邮箱
  operator text,--操作员
  is_delete integer,--逻辑删除标识
  CONSTRAINT id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "users"
  OWNER TO postgres;
COMMENT ON COLUMN "users".id IS '主键ID';
COMMENT ON COLUMN "users".name IS '姓名';
COMMENT ON COLUMN "users".age IS '年龄';
COMMENT ON COLUMN "users".email IS '邮箱';
COMMENT ON COLUMN "users".operator IS '操作员';
COMMENT ON COLUMN "users".is_delete IS '逻辑删除标识';

