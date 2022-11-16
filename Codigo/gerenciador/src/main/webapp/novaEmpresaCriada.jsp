<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<html>
	<body>
		<core:if test="${not empty nomeEmpresa }">
			Empresa ${nomeEmpresa} cadastra com sucesso!
		</core:if>
		
		<core:if test="${empty nomeEmpresa}">
			Nenhuma empresa cadastrada!
		</core:if>
		
	</body>
</html>