<%@include file="../../head.inc"%>
<%@page import="de.hybris.platform.cronjob.hmc.CronJobContentChip"%>

<%
	CronJobContentChip theChip = (CronJobContentChip) request.getAttribute(AbstractChip.CHIP_KEY);
%>

<table style="background-image: url( images/alpha.png )" width="100%" style="height:100%;">
	<table width="100%">
		<tr>
			<td class="sectionheader"> 
			   cronjob, generated by extGen.
	   	</td>
		</tr>
	</table>	
	
	<table cellspacing="0" cellpadding="20" width="100%" height="10px">
		<tr nowrap>
			<td width="100%">
			  This is an example for a generated ContentChip.
			  <p>
           Current User: <%=JaloSession.getCurrentSession().getUser().getLogin()%><p>
			</td>
		</tr>
	</table>
</table>
