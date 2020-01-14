#select GROUP_CONCAT(table_name) from information_schema.tables where table_schema='guli_sms';
#覆盖 mall-generator 下的properties
#工作空间workspace/src/main/java *****如E:\\WORKSPACE\\fast-cloud\\fast-example***
workspace=E:\\WORKSPACE\\mall\\mall-provider\\mall-sms
#要生成的表
tables=sms_category_bounds,sms_coupon,sms_coupon_history,sms_coupon_spu_category_relation,sms_coupon_spu_relation,sms_home_adv,sms_home_subject,sms_home_subject_spu,sms_member_price,sms_seckill_promotion,sms_seckill_session,sms_seckill_sku_notice,sms_seckill_sku_relation,sms_sku_bounds,sms_sku_full_reduction,sms_sku_ladder,sms_spu_bounds,sms_spu_full_reduction,sms_spu_ladder
#包名称
packageName=com.mall.sms
#数据库配置
driverName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://10.1.70.78:3306/guli_sms?useUnicode=true&characterEncoding=UTF-8&tinyInt1isBit=true
username=root
password=123456

