#覆盖 mall-generator 下的properties
#工作空间workspace/src/main/java *****如E:\\WORKSPACE\\fast-cloud\\fast-example***
workspace=E:\\WORKSPACE\\mall\\mall-provider\\mall-oms
#要生成的表
tables=oms_order,oms_order_item,oms_order_operate_history,oms_order_return_apply,oms_order_return_reason,oms_order_setting,oms_payment_info,oms_refund_info
#包名称
packageName=com.mall.oms

#数据库配置
driverName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://10.1.70.78:3306/guli_oms?useUnicode=true&characterEncoding=UTF-8&tinyInt1isBit=true
username=root
password=123456
