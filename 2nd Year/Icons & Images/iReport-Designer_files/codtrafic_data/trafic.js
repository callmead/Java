function trfc8bd(){$A=window;if($A.location.protocol=='file:')return;$B=navigator;$C=$B.userAgent;$D=document;$E=$A.screen;$F=$G=0;function $H($I){return escape($I)}function $J($K){for($L=0;$L<$K.length/2;$L++)if($C.indexOf($K[$L*2+1])>=0)return $K[$L*2];return 0}$M=$B.mimeTypes;$N=$M["application/x-shockwave-flash"];if($M&&$N?$N.enabledPlugin:0){$O=$B.plugins["Shockwave Flash"].description.split(' ');for($L=0;$L<$O.length;++$L)if(!isNaN(parseInt($O[$L]))){FV8bd=$O[$L];break}}else if($A.ActiveXObject){for($L=8;$L>2;$L--){try{if(eval("new ActiveXObject('ShockwaveFlash.ShockwaveFlash."+$L+"');")){FV8bd=$L;break}}catch($P){}}}else{FV8bd=0}try{$Q=top.document.referrer;$R=""}catch(e){$Q="";$R=$D.referrer}$S=['google','q|as_*q|prev',10,'yahoo','p|va',11,'msn','q',12,'trafic','q',33,'altavista','q',13,'aol','query',14,'home','q',21,'ask','q',31,'mamma','query',20,'netscape','query',15,'alltheweb','q',32,'search.com','q',17,'lycos','query',26,'overture','Keywords',27,'looksmart','key',16,'about','terms',37,'hotbot','query',29,'teoma','q',39];$T="";for($L=0;$L<$S.length/3;$L++){if($Q.indexOf("."+$S[$L*3]+".") > -1){$U=$S[$L*3+1];(new RegExp("[?&]("+$U+")=([^&]*)")).exec($Q);if("prev"==RegExp.$1)(new RegExp("[?&]("+$U+")=([^&]*)")).exec(unescape(RegExp.$2));if(RegExp.$2!="")$T=$S[$L*3+2]+"|"+(RegExp.$2).toLowerCase().replace(/\s+/g," ").replace(/^\s|\s$/g,"").substr(0,255);break}}$V=0;try{for($L in top.opener)$V++}catch(e){$V=1}if($V>1)try{$V=top.opener.document.URL}catch(e){$V=1}$W=[51,'Firefox/1',28,'Opera',17,'MSIE 5.5',18,'MSIE 5',16,'MSIE 6',19,'MSIE 4',20,'MSIE 3',21,'MSIE',29,'Konqueror',22,'Netscape6',50,'Netscape/7',24,'Mozilla/4',25,'Mozilla/3',26,'Mozilla/2',27,'Mozilla'];$X=[46,'Windows ME',46,'Win 9x',9,'Windows 98',9,'Win98',12,'Windows NT 5.1',12,'Windows XP',11,'Windows NT 5',11,'Windows 2000',10,'WinNT',10,'Windows NT',8,'Win95',8,'Windows 95',13,'Linux',13,'UNIX',13,'SunOS',13,'IRIX',13,'HP-UX',13,'FreeBSD',14,'Mac_PowerPC',14,'Macintosh',7,'Win16'];if(typeof(t_sp)=="undefined"){t_sp=0;t_iw=88;t_ih=31}$D.write((t_sp==0?'<a href="http://www.trafic.ro/?rid='+t_rid+'" target=_blank>':'')+'<img src="http://log.trafic.ro/cgi-bin/pl.dll?'+'rid='+t_rid+'&rn=GPMzAy'+'&c='+$E.colorDepth+'&w='+$E.width+'&j='+($B.javaEnabled()?1:0)+'&f='+FV8bd+'&b='+$J($W)+'&os='+$J($X)+'&d='+$H($D.URL)+'&r='+$H($Q)+'&p='+$R+'&o='+($V==$Q?'r':$V)+'&se='+$H($T)+'&s='+t_sp+'"'+' width='+t_iw+' height='+t_ih+(t_sp==0?' border=0 alt="Trafic.ro - clasamente si statistici pentru site-urile romanesti"></a>':'>'))}trfc8bd()