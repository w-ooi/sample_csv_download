<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>CSVファイルのダウンロード</h3>
	<p>次のリンクをクリックしてください</p>
	<a href="${requestScope.fileName}">CSVファイルをダウンロードします</a>
	<hr>
	<p><span style="color:#ff0000;">ファイル名は「現在日時分秒.csv」になります。<br>
	ダウンロードしたファイルはExcelで開くと文字化けするのでテキストエディタで開いて下さい。
	</span></p>
</body>
</html>