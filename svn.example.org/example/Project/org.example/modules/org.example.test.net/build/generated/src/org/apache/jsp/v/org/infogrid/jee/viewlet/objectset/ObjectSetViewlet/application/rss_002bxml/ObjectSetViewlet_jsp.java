package org.apache.jsp.v.org.infogrid.jee.viewlet.objectset.ObjectSetViewlet.application.rss_002bxml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ObjectSetViewlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tmpl_requestedTemplate_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_objectset_iteratecontentrow;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tmpl_requestedTemplate_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_objectset_iteratecontentrow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.release();
    _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody.release();
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.release();
    _jspx_tagPool_tmpl_requestedTemplate_name_nobody.release();
    _jspx_tagPool_objectset_iteratecontentrow.release();
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.release();
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.release();
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("application/rss+xml");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      if (_jspx_meth_tmpl_requestedTemplate_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<rss version=\"2.0\" xmlns:ig=\"http://infogrid.org/xmlns/1\">\n");
      out.write(" <channel>\n");
      out.write("  <title>Objects found by traversing ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.traversalSpecification}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("     from: ");
      if (_jspx_meth_mesh_meshObjectId_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </title>\n");
      out.write("  <link>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Viewlet.fullRequestURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</link>\n");
      out.write("  <generator>InfoGrid.org org.infogrid.jee.viewlet.objectset.ObjectSetViewlet</generator>\n");
      out.write("  ");
      if (_jspx_meth_mesh_blessedByIterate_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_objectset_iterate_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </channel>\n");
      out.write("</rss>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tmpl_requestedTemplate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tmpl:requestedTemplate
    org.infogrid.jee.taglib.templates.RequestedTemplateTag _jspx_th_tmpl_requestedTemplate_0 = (org.infogrid.jee.taglib.templates.RequestedTemplateTag) _jspx_tagPool_tmpl_requestedTemplate_name_nobody.get(org.infogrid.jee.taglib.templates.RequestedTemplateTag.class);
    _jspx_th_tmpl_requestedTemplate_0.setPageContext(_jspx_page_context);
    _jspx_th_tmpl_requestedTemplate_0.setParent(null);
    _jspx_th_tmpl_requestedTemplate_0.setName("verbatim");
    int _jspx_eval_tmpl_requestedTemplate_0 = _jspx_th_tmpl_requestedTemplate_0.doStartTag();
    if (_jspx_th_tmpl_requestedTemplate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tmpl_requestedTemplate_name_nobody.reuse(_jspx_th_tmpl_requestedTemplate_0);
      return true;
    }
    _jspx_tagPool_tmpl_requestedTemplate_name_nobody.reuse(_jspx_th_tmpl_requestedTemplate_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectId_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_0 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_0.setParent(null);
    _jspx_th_mesh_meshObjectId_0.setMeshObjectName("Subject");
    _jspx_th_mesh_meshObjectId_0.setStringRepresentation("Html");
    _jspx_th_mesh_meshObjectId_0.setMaxLength(30);
    int _jspx_eval_mesh_meshObjectId_0 = _jspx_th_mesh_meshObjectId_0.doStartTag();
    if (_jspx_th_mesh_meshObjectId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_stringRepresentation_meshObjectName_maxLength_nobody.reuse(_jspx_th_mesh_meshObjectId_0);
    return false;
  }

  private boolean _jspx_meth_mesh_blessedByIterate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:blessedByIterate
    org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag _jspx_th_mesh_blessedByIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag) _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.get(org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag.class);
    _jspx_th_mesh_blessedByIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_blessedByIterate_0.setParent(null);
    _jspx_th_mesh_blessedByIterate_0.setMeshObjectName("Subject");
    _jspx_th_mesh_blessedByIterate_0.setBlessedByLoopVar("blessedBy");
    int _jspx_eval_mesh_blessedByIterate_0 = _jspx_th_mesh_blessedByIterate_0.doStartTag();
    if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_blessedByIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_blessedByIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("   <ig:MeshType>");
        if (_jspx_meth_mesh_meshTypeId_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
          return true;
        out.write("</ig:MeshType>\n");
        out.write("   ");
        if (_jspx_meth_mesh_propertyIterate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_mesh_blessedByIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_blessedByIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_blessedByIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshTypeId_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshTypeId
    org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag _jspx_th_mesh_meshTypeId_0 = (org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag) _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag.class);
    _jspx_th_mesh_meshTypeId_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshTypeId_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_mesh_meshTypeId_0.setMeshTypeName("blessedBy");
    _jspx_th_mesh_meshTypeId_0.setStringRepresentation("Plain");
    int _jspx_eval_mesh_meshTypeId_0 = _jspx_th_mesh_meshTypeId_0.doStartTag();
    if (_jspx_th_mesh_meshTypeId_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_0);
      return true;
    }
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_0);
    return false;
  }

  private boolean _jspx_meth_mesh_propertyIterate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:propertyIterate
    org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag _jspx_th_mesh_propertyIterate_0 = (org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag) _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag.class);
    _jspx_th_mesh_propertyIterate_0.setPageContext(_jspx_page_context);
    _jspx_th_mesh_propertyIterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_0);
    _jspx_th_mesh_propertyIterate_0.setMeshObjectName("Subject");
    _jspx_th_mesh_propertyIterate_0.setMeshTypeName("blessedBy");
    _jspx_th_mesh_propertyIterate_0.setPropertyTypeLoopVar("propertyType");
    _jspx_th_mesh_propertyIterate_0.setPropertyValueLoopVar("propertyValue");
    _jspx_th_mesh_propertyIterate_0.setSkipNullProperty(false);
    int _jspx_eval_mesh_propertyIterate_0 = _jspx_th_mesh_propertyIterate_0.doStartTag();
    if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_propertyIterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_propertyIterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("       <ig:Property type=\"");
        if (_jspx_meth_mesh_meshTypeId_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_propertyIterate_0, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${propertyValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</ig:Property>\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_mesh_propertyIterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_propertyIterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_propertyIterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
      return true;
    }
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshTypeId_1(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_propertyIterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshTypeId
    org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag _jspx_th_mesh_meshTypeId_1 = (org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag) _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag.class);
    _jspx_th_mesh_meshTypeId_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshTypeId_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_propertyIterate_0);
    _jspx_th_mesh_meshTypeId_1.setMeshTypeName("propertyType");
    _jspx_th_mesh_meshTypeId_1.setStringRepresentation("Plain");
    int _jspx_eval_mesh_meshTypeId_1 = _jspx_th_mesh_meshTypeId_1.doStartTag();
    if (_jspx_th_mesh_meshTypeId_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_1);
      return true;
    }
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_1);
    return false;
  }

  private boolean _jspx_meth_objectset_iterate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  objectset:iterate
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag _jspx_th_objectset_iterate_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag) _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateTag.class);
    _jspx_th_objectset_iterate_0.setPageContext(_jspx_page_context);
    _jspx_th_objectset_iterate_0.setParent(null);
    _jspx_th_objectset_iterate_0.setMeshObjectSetName("Viewlet.viewedMeshObjects.reachedObjects");
    _jspx_th_objectset_iterate_0.setLoopVar("current");
    _jspx_th_objectset_iterate_0.setIgnore("true");
    int _jspx_eval_objectset_iterate_0 = _jspx_th_objectset_iterate_0.doStartTag();
    if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_objectset_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_objectset_iterate_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_objectset_iteratecontentrow_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iterate_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_objectset_iterate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_objectset_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_objectset_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.reuse(_jspx_th_objectset_iterate_0);
      return true;
    }
    _jspx_tagPool_objectset_iterate_meshObjectSetName_loopVar_ignore.reuse(_jspx_th_objectset_iterate_0);
    return false;
  }

  private boolean _jspx_meth_objectset_iteratecontentrow_0(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  objectset:iteratecontentrow
    org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag _jspx_th_objectset_iteratecontentrow_0 = (org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag) _jspx_tagPool_objectset_iteratecontentrow.get(org.infogrid.jee.taglib.mesh.set.MeshObjectSetIterateContentRowTag.class);
    _jspx_th_objectset_iteratecontentrow_0.setPageContext(_jspx_page_context);
    _jspx_th_objectset_iteratecontentrow_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iterate_0);
    int _jspx_eval_objectset_iteratecontentrow_0 = _jspx_th_objectset_iteratecontentrow_0.doStartTag();
    if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_objectset_iteratecontentrow_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_objectset_iteratecontentrow_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <item>\n");
        out.write("     <guid>");
        if (_jspx_meth_mesh_meshObjectId_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iteratecontentrow_0, _jspx_page_context))
          return true;
        out.write("</guid>\n");
        out.write("     ");
        if (_jspx_meth_mesh_blessedByIterate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_objectset_iteratecontentrow_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    </item>\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_objectset_iteratecontentrow_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_objectset_iteratecontentrow_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_objectset_iteratecontentrow_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_objectset_iteratecontentrow.reuse(_jspx_th_objectset_iteratecontentrow_0);
      return true;
    }
    _jspx_tagPool_objectset_iteratecontentrow.reuse(_jspx_th_objectset_iteratecontentrow_0);
    return false;
  }

  private boolean _jspx_meth_mesh_meshObjectId_1(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iteratecontentrow_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshObjectId
    org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag _jspx_th_mesh_meshObjectId_1 = (org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag) _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody.get(org.infogrid.jee.taglib.mesh.MeshObjectIdentifierTag.class);
    _jspx_th_mesh_meshObjectId_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshObjectId_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iteratecontentrow_0);
    _jspx_th_mesh_meshObjectId_1.setMeshObjectName("current");
    int _jspx_eval_mesh_meshObjectId_1 = _jspx_th_mesh_meshObjectId_1.doStartTag();
    if (_jspx_th_mesh_meshObjectId_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody.reuse(_jspx_th_mesh_meshObjectId_1);
      return true;
    }
    _jspx_tagPool_mesh_meshObjectId_meshObjectName_nobody.reuse(_jspx_th_mesh_meshObjectId_1);
    return false;
  }

  private boolean _jspx_meth_mesh_blessedByIterate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_objectset_iteratecontentrow_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:blessedByIterate
    org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag _jspx_th_mesh_blessedByIterate_1 = (org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag) _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.get(org.infogrid.jee.taglib.mesh.MeshObjectBlessedByIterateTag.class);
    _jspx_th_mesh_blessedByIterate_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_blessedByIterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_objectset_iteratecontentrow_0);
    _jspx_th_mesh_blessedByIterate_1.setMeshObjectName("current");
    _jspx_th_mesh_blessedByIterate_1.setBlessedByLoopVar("blessedBy");
    int _jspx_eval_mesh_blessedByIterate_1 = _jspx_th_mesh_blessedByIterate_1.doStartTag();
    if (_jspx_eval_mesh_blessedByIterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_blessedByIterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_blessedByIterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_blessedByIterate_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      <ig:MeshType>");
        if (_jspx_meth_mesh_meshTypeId_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_1, _jspx_page_context))
          return true;
        out.write("</ig:MeshType>\n");
        out.write("      ");
        if (_jspx_meth_mesh_propertyIterate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_blessedByIterate_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_mesh_blessedByIterate_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_blessedByIterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_blessedByIterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_1);
      return true;
    }
    _jspx_tagPool_mesh_blessedByIterate_meshObjectName_blessedByLoopVar.reuse(_jspx_th_mesh_blessedByIterate_1);
    return false;
  }

  private boolean _jspx_meth_mesh_meshTypeId_2(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshTypeId
    org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag _jspx_th_mesh_meshTypeId_2 = (org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag) _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag.class);
    _jspx_th_mesh_meshTypeId_2.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshTypeId_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_1);
    _jspx_th_mesh_meshTypeId_2.setMeshTypeName("blessedBy");
    _jspx_th_mesh_meshTypeId_2.setStringRepresentation("Plain");
    int _jspx_eval_mesh_meshTypeId_2 = _jspx_th_mesh_meshTypeId_2.doStartTag();
    if (_jspx_th_mesh_meshTypeId_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_2);
      return true;
    }
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_2);
    return false;
  }

  private boolean _jspx_meth_mesh_propertyIterate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_blessedByIterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:propertyIterate
    org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag _jspx_th_mesh_propertyIterate_1 = (org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag) _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.get(org.infogrid.jee.taglib.mesh.MeshObjectPropertyIterateTag.class);
    _jspx_th_mesh_propertyIterate_1.setPageContext(_jspx_page_context);
    _jspx_th_mesh_propertyIterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_blessedByIterate_1);
    _jspx_th_mesh_propertyIterate_1.setMeshObjectName("current");
    _jspx_th_mesh_propertyIterate_1.setMeshTypeName("blessedBy");
    _jspx_th_mesh_propertyIterate_1.setPropertyTypeLoopVar("propertyType");
    _jspx_th_mesh_propertyIterate_1.setPropertyValueLoopVar("propertyValue");
    _jspx_th_mesh_propertyIterate_1.setSkipNullProperty(false);
    int _jspx_eval_mesh_propertyIterate_1 = _jspx_th_mesh_propertyIterate_1.doStartTag();
    if (_jspx_eval_mesh_propertyIterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mesh_propertyIterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mesh_propertyIterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mesh_propertyIterate_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <ig:Property type=\"");
        if (_jspx_meth_mesh_meshTypeId_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_mesh_propertyIterate_1, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${propertyValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</ig:Property>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_mesh_propertyIterate_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mesh_propertyIterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_mesh_propertyIterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_1);
      return true;
    }
    _jspx_tagPool_mesh_propertyIterate_skipNullProperty_propertyValueLoopVar_propertyTypeLoopVar_meshTypeName_meshObjectName.reuse(_jspx_th_mesh_propertyIterate_1);
    return false;
  }

  private boolean _jspx_meth_mesh_meshTypeId_3(javax.servlet.jsp.tagext.JspTag _jspx_th_mesh_propertyIterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mesh:meshTypeId
    org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag _jspx_th_mesh_meshTypeId_3 = (org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag) _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.get(org.infogrid.jee.taglib.mesh.MeshTypeIdentifierTag.class);
    _jspx_th_mesh_meshTypeId_3.setPageContext(_jspx_page_context);
    _jspx_th_mesh_meshTypeId_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mesh_propertyIterate_1);
    _jspx_th_mesh_meshTypeId_3.setMeshTypeName("propertyType");
    _jspx_th_mesh_meshTypeId_3.setStringRepresentation("Plain");
    int _jspx_eval_mesh_meshTypeId_3 = _jspx_th_mesh_meshTypeId_3.doStartTag();
    if (_jspx_th_mesh_meshTypeId_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_3);
      return true;
    }
    _jspx_tagPool_mesh_meshTypeId_stringRepresentation_meshTypeName_nobody.reuse(_jspx_th_mesh_meshTypeId_3);
    return false;
  }
}
