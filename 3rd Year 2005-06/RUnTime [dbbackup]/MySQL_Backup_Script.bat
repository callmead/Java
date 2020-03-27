@Echo OFF

mysqldump --skip-triggers --password=dxxdydk -u root pdmsdb > .\MySQL_Backup\pdmsdb_backup.dbb

pause