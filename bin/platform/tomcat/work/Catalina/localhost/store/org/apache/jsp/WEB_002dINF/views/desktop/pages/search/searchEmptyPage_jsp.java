/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-05-18 05:59:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.desktop.pages.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchEmptyPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(38);
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScriptVariables.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/footer/footer.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/debug/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/master.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/theme/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/css.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/previewJS.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/previewCSS.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/page.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/accelerator_granule.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/header.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/nav/topNavigation.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/debug/debugFooter.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/nav/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/styleSheets.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/googleAnalytics.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/js.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/analytics.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/htmlmeta.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/jirafe.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/addonScripts.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/globalMessages.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/nav/searchSpellingSuggestion.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScriptAddOnsVariables.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/cartRestoration.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/cmstags.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/product/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScript.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/footer/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/bottomHeader.tag", Long.valueOf(1421901254000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005ftext_005fcode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005ftext_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.release();
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005ftext_005fcode_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      if (_jspx_meth_template_005fpage_005f0(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_template_005fpage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  template:page
    org.apache.jsp.tag.webdesktop.template.page_tag _jspx_th_template_005fpage_005f0 = (new org.apache.jsp.tag.webdesktop.template.page_tag());
    _jsp_instancemanager.newInstance(_jspx_th_template_005fpage_005f0);
    _jspx_th_template_005fpage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(13,0) name = pageTitle type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fpage_005f0.setPageTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_template_005fpage_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_template_005fpage_005f0, null));
    _jspx_th_template_005fpage_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_template_005fpage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(14,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty message}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_spring_005ftheme_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(15,2) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
      if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_common_005fglobalMessages_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  common:globalMessages
    org.apache.jsp.tag.webdesktop.common.globalMessages_tag _jspx_th_common_005fglobalMessages_005f0 = (new org.apache.jsp.tag.webdesktop.common.globalMessages_tag());
    _jsp_instancemanager.newInstance(_jspx_th_common_005fglobalMessages_005f0);
    _jspx_th_common_005fglobalMessages_005f0.setJspContext(_jspx_page_context);
    _jspx_th_common_005fglobalMessages_005f0.setParent(_jspx_parent);
    _jspx_th_common_005fglobalMessages_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_common_005fglobalMessages_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(22,2) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setPosition("SideContent");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(22,2) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setVar("feature");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(22,2) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setElement("div");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(22,2) null
    _jspx_th_cms_005fpageSlot_005f0.setDynamicAttribute(null, "class", "span-4 side-content-slot cms_disp-img_slot");
    int _jspx_eval_cms_005fpageSlot_005f0 = _jspx_th_cms_005fpageSlot_005f0.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f0(_jspx_th_cms_005fpageSlot_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f0);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(23,3) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f0.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feature}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f0 = _jspx_th_cms_005fcomponent_005f0.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(29,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("search.no.results");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(29,9) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setText("No Results Found");
    int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
      if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f1 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(32,4) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setPosition("MiddleContent");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(32,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setVar("comp");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(32,4) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setElement("div");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(32,4) null
    _jspx_th_cms_005fpageSlot_005f1.setDynamicAttribute(null, "class", "item_container");
    int _jspx_eval_cms_005fpageSlot_005f1 = _jspx_th_cms_005fpageSlot_005f1.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f1(_jspx_th_cms_005fpageSlot_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f1);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f1);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f1 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f1);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(33,5) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f1.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comp}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f1 = _jspx_th_cms_005fcomponent_005f1.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f1);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f1);
    return false;
  }

  private boolean _jspx_meth_nav_005fsearchSpellingSuggestion_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nav:searchSpellingSuggestion
    org.apache.jsp.tag.webdesktop.nav.searchSpellingSuggestion_tag _jspx_th_nav_005fsearchSpellingSuggestion_005f0 = (new org.apache.jsp.tag.webdesktop.nav.searchSpellingSuggestion_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nav_005fsearchSpellingSuggestion_005f0);
    _jspx_th_nav_005fsearchSpellingSuggestion_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005fsearchSpellingSuggestion_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(37,5) name = spellingSuggestion type = de.hybris.platform.commerceservices.search.facetdata.SpellingSuggestionData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005fsearchSpellingSuggestion_005f0.setSpellingSuggestion((de.hybris.platform.commerceservices.search.facetdata.SpellingSuggestionData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchPageData.spellingSuggestion}", de.hybris.platform.commerceservices.search.facetdata.SpellingSuggestionData.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_nav_005fsearchSpellingSuggestion_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nav_005fsearchSpellingSuggestion_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f2 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(41,3) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setPosition("BottomContent");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(41,3) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setVar("comp");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(41,3) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setElement("div");
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(41,3) null
    _jspx_th_cms_005fpageSlot_005f2.setDynamicAttribute(null, "class", "span-20 cms_disp-img_slot right last");
    int _jspx_eval_cms_005fpageSlot_005f2 = _jspx_th_cms_005fpageSlot_005f2.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f2(_jspx_th_cms_005fpageSlot_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f2);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f2);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f2 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f2);
    // /WEB-INF/views/desktop/pages/search/searchEmptyPage.jsp(42,4) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f2.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comp}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f2 = _jspx_th_cms_005fcomponent_005f2.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f2);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f2);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div id=\"globalMessages\">\n");
      out.write("\t\t");
      if (_jspx_meth_common_005fglobalMessages_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\n");
      out.write("\t<div class=\"span-24\">\n");
      out.write("\t\t");
      if (_jspx_meth_cms_005fpageSlot_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div class=\"span-20 right last\">\n");
      out.write("\t\t\t<div class=\"item_container_holder\">\n");
      out.write("\t\t\t\t<div class=\"title_holder\">\n");
      out.write("\t\t\t\t\t<h2>");
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_cms_005fpageSlot_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div class=\"item_container\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_nav_005fsearchSpellingSuggestion_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_cms_005fpageSlot_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\n");
      out.write("\t</div>\n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
