<!doctype html>

<html>
<head>
    <title>Forum</title>

    <link rel="stylesheet" href="${resource(file: 'bootstrap.min.css')}" />
    <asset:javascript src="application.js" />
</head>
<body style="background-image: url('${assetPath(src: '/bg.jpg')}');color:#AAAAAA">
<g:render template="header" contextPath="/" />

<g:render template="components/${component}" contextPath="/" />

<g:render template="footer" contextPath="/" />
</body>
</html>
