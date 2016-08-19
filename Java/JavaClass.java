<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

<#if package?? && package != "">
package ${package};

</#if>
/**
 * @FileName ${name}.java
 * @date ${date}
 * @time ${time}
 * @author ${user}
 * @Description description of the class
 * @version 1.00 9999/99/99 ${user}
 * <p> 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class ${name} {

}
