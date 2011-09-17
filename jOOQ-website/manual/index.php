
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../frame.php';
function printH1() {
    print "The jOOQ User Manual";
}
function getSlogan() {
	return "
			Learn about jOOQ using its single or multi-paged manuals
		";
}
function printContent() {
    global $root;
?>
<table cellpadding="0" cellspacing="0" border="0" width="100%">
<tr>
<td align="left" valign="top"><a href="<?=$root?>/manual/">The jOOQ User Manual</a></td><td align="right" valign="top" style="white-space: nowrap"><a href="<?=$root?>/manual/JOOQ/" title="jOOQ classes and their usage">next</a></td>
</tr>
</table>
			<h3>Single-paged manuals</h3>
			<p>Coming soon in the manuals section of the jOOQ website:</p>
			<ul>
				
<li>A single-paged HTML manual</li>
				
<li>A downloadable PDF manual</li>
			
</ul>
			<h3>The multi-paged manual</h3>
			<p>This manual is divided into four main sections:</p>
			<ul>
				
<li>
					
<a href="<?=$root?>/manual/JOOQ/">jOOQ classes and their usage</a>
					
<p>
						See these chapters for an overview of the jOOQ internal architecture
						and all types that are involved with jOOQ's query creation and
						execution. This is the important part for you, also, if you wish to
						extend jOOQ
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/META/">Meta model code generation</a>
					
<p>
						See these chapters to understand how you can use jOOQ as a source code
						generator, and what type of artefacts are generated by jOOQ
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/DSL/">DSL or fluent API</a>
					
<p>
						See these chapters to learn about how to use jOOQ in every day's work. The
						jOOQ DSL is the main way to create and execute jOOQ queries almost as
						if SQL was embedded in Java directly
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/ADVANCED/">Advanced topics</a>
					
<p>
						Some advanced topics including not-everyday functionality
					</p>
				
</li>
			
</ul>
		<h3>Table of contents</h3><ol>
<li>
<a href="<?=$root?>/manual/JOOQ/" title="jOOQ classes and their usage">jOOQ classes and their usage</a>
<ol>
<li>
<a href="<?=$root?>/manual/JOOQ/ExampleDatabase/" title="The example database">The example database</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Factory/" title="The Factory class">The Factory class</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Table/" title="Tables and Fields">Tables and Fields</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Result/" title="Results and Records">Results and Records</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/UpdatableRecord/" title="Updatable Records">Updatable Records</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Query/" title="Query and its subtypes">Query and its subtypes</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/ResultQuery/" title="ResultQuery and various ways of fetching data">ResultQuery and various ways of fetching data</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/QueryPart/" title="QueryParts and the global architecture">QueryParts and the global architecture</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Serializability/" title="Serializability of QueryParts and Results">Serializability of QueryParts and Results</a>
</li>
<li>
<a href="<?=$root?>/manual/JOOQ/Extend/" title="Extend jOOQ types with custom implementations">Extend jOOQ types with custom implementations</a>
</li>
</ol>
</li>
<li>
<a href="<?=$root?>/manual/META/" title="Meta model code generation">Meta model code generation</a>
<ol>
<li>
<a href="<?=$root?>/manual/META/Configuration/" title="Configuration and setup">Configuration and setup</a>
</li>
<li>
<a href="<?=$root?>/manual/META/SCHEMA/" title="Schemata">Schemata</a>
</li>
<li>
<a href="<?=$root?>/manual/META/TABLE/" title="Tables and views and their corresponding records">Tables and views and their corresponding records</a>
</li>
<li>
<a href="<?=$root?>/manual/META/PROCEDURE/" title="Procedures and packages">Procedures and packages</a>
</li>
<li>
<a href="<?=$root?>/manual/META/UDT/" title="UDT's including ARRAY and ENUM types">UDT's including ARRAY and ENUM types</a>
</li>
<li>
<a href="<?=$root?>/manual/META/SEQUENCE/" title="Sequences">Sequences</a>
</li>
</ol>
</li>
<li>
<a href="<?=$root?>/manual/DSL/" title="DSL or fluent API">DSL or fluent API</a>
<ol>
<li>
<a href="<?=$root?>/manual/DSL/SELECT/" title="Complete SELECT syntax">Complete SELECT syntax</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/CONDITION/" title="Conditions">Conditions</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/ALIAS/" title="Aliased tables and fields">Aliased tables and fields</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/IN/" title="Nested select statements using the IN operator">Nested select statements using the IN operator</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/EXISTS/" title="Nested select statements using the EXISTS operator">Nested select statements using the EXISTS operator</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/NESTED/" title="Other types of nested selects">Other types of nested selects</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/UNION/" title="UNION and other set operations">UNION and other set operations</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/FUNCTIONS/" title="Functions, aggregate operators, and window functions">Functions, aggregate operators, and window functions</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/PROCEDURES/" title="Stored procedures and functions">Stored procedures and functions</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/ARITHMETIC/" title="Arithmetic operations">Arithmetic operations</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/CASE/" title="The CASE clause">The CASE clause</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/CAST/" title="Type casting">Type casting</a>
</li>
<li>
<a href="<?=$root?>/manual/DSL/SQL/" title="When it's just much easier: Plain SQL">When it's just much easier: Plain SQL</a>
</li>
</ol>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/" title="Advanced topics">Advanced topics</a>
<ol>
<li>
<a href="<?=$root?>/manual/ADVANCED/MasterData/" title="Master data generation">Master data generation</a>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/SchemaMapping/" title="Mapping generated schemata and tables to productive environments">Mapping generated schemata and tables to productive environments</a>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/OracleHints/" title="Adding Oracle hints to queries">Adding Oracle hints to queries</a>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/CONNECTBY/" title="The Oracle CONNECT BY clause for hierarchical queries">The Oracle CONNECT BY clause for hierarchical queries</a>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/Export/" title="Exporting data to XML, CSV, JSON, HTML, Text">Exporting data to XML, CSV, JSON, HTML, Text</a>
</li>
<li>
<a href="<?=$root?>/manual/ADVANCED/Import/" title="Importing data from XML, CSV">Importing data from XML, CSV</a>
</li>
</ol>
</li>
</ol>
<?php 
}
?>

