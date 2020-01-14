@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, MybatisPlusConfig.class})

需要生成的表

````
sys_account,sys_account_roles,sys_department,sys_dict,sys_dict_data,sys_log,sys_login_config,sys_permission,sys_roles,sys_roles_dept,sys_roles_permission
````

