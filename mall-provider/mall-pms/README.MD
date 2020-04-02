#覆盖 mall-generator 下的properties
#工作空间workspace/src/main/java *****如E:\\WORKSPACE\\fast-cloud\\fast-example***
workspace=E:\\WORKSPACE\\mall\\mall-provider\\mall-pms
#要生成的表
tables=pms_attr,pms_attr_attrgroup_relation,pms_attr_group,pms_brand,pms_category,pms_comment_replay,pms_product_attr_value,pms_sku_images,pms_sku_info,pms_sku_sale_attr_value,pms_spu_comment,pms_spu_images,pms_spu_info,pms_spu_info_desc
#
#包名称
packageName=com.mall.pms

#数据库配置
driverName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://10.1.70.81:3306/guli_pms?useUnicode=true&characterEncoding=UTF-8&tinyInt1isBit=true
username=root
password=123456
