<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

var gridMain = "grid_main"

var array = {"name":"wy", "age":"29"};

$(document).ready(function() {
  $("#"+gridMain).jqGrid({
    url : 'getAuthorityMgtList',
    mtype: "POST",
    datatype :'local',
    colNames:['name'],
    colModel : [
      {name: 'name', align:'center'}
    ],
    viewrecords: true,
    height : 250,
    rowNum : 101,
    paget :"#pager",
    caption:"subject"
  });
  
  //for(var i in array){
  //  $("#"+gridMain).jqGrid('addRowData', i+1, array[i]);
  //}
  
  //$("#"+gridMain).jqGrid("clearGridData");
  
  $("#"+gridMain).setGridParam({
    datatype : "json",
    postData : {"param": JSON.stringify(array)},
    loadComplete : function(data) {
      
    }
  }).trigger("reloadGrid");
  
});

</script>
</head>
<body>
  <table id="grid_main"></table>
  <div id="pager"></div>
  
</body>
</html>