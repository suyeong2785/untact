<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../part/mainLayoutHead.jspf"%>


<section class="section-1">
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		<div class="flex items-center">
			<div class="flex-grow"></div>

			<a href="add?boardId=${board.id}"
				class="btn-primary bg-blue-500 hover:bg-blue-dark text-white font-bold py-2 px-4 rounded">글쓰기</a>
		</div>
		<div>
			<c:forEach items="${boards}" var="board">
				<c:set var="detailUrl" value="detail?id=${board.id}" />
				<div class="flex items-center mt-10">
					<a href="${detailUrl}" class="font-bold">NO. ${board.id}</a>
					<a href="${detailUrl}" class="ml-2 font-light text-gray-600">${board.regDate}</a>
					<div class="flex-grow"></div>
				</div>
				<div class="mt-2">
					<a href="${detailUrl}"
						class="text-2xl text-gray-700 font-bold hover:underline">${board.code}</a>
					<a href="${detailUrl}" class="mt-2 text-gray-600 block">${board.name}</a>
				</div>
				<div class="flex items-center mt-4">
					<a href="detail?id=${board.id}"
						class="text-blue-500 hover:underline">자세히 보기</a>
					<a href="modify?id=${board.id}"
						class="ml-2 text-blue-500 hover:underline">수정</a>
					<a onclick="if ( !confirm('삭제하시겠습니까?') ) return false;" href="doDelete?id=${board.id}"
						class="ml-2 text-blue-500 hover:underline">삭제</a>
					<div class="flex-grow"></div>
					<div>
						<a class="flex items-center">
						
						</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>