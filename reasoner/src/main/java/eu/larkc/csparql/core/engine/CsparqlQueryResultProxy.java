/*******************************************************************************
 * Copyright 2014 DEIB -Politecnico di Milano
 *   
 *  Marco Balduini (marco.balduini@polimi.it)
 *  Emanuele Della Valle (emanuele.dellavalle@polimi.it)
 *  Davide Barbieri
 *   
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *   
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *   
 *  Acknowledgements:
 *  
 *  This work was partially supported by the European project LarKC (FP7-215535)
 ******************************************************************************/
package eu.larkc.csparql.core.engine;

import java.util.Observable;

import eu.larkc.csparql.common.NamedObject;
import eu.larkc.csparql.common.RDFTable;

public class CsparqlQueryResultProxy extends Observable implements NamedObject {

	private String id;
	private String sparqlQueryId;
	private String cepQueryId;


	public String getId() {
		return this.id;
	}

	public CsparqlQueryResultProxy(String id) {
		this.id = id;
	}
	
	public CsparqlQueryResultProxy(String id, String sparqlQueryId,
			String cepQueryId) {
		super();
		this.id = id;
		this.sparqlQueryId = sparqlQueryId;
		this.cepQueryId = cepQueryId;
	}

	public void notify(Object result) {
		
		RDFTable quads = (RDFTable) result;
		
		setChanged();
		this.notifyObservers(quads);

	}

	public String getSparqlQueryId() {
		return sparqlQueryId;
	}

	public void setSparqlQueryId(String sparqlQueryId) {
		this.sparqlQueryId = sparqlQueryId;
	}

	public String getCepQueryId() {
		return cepQueryId;
	}

	public void setCepQueryId(String cepQueryId) {
		this.cepQueryId = cepQueryId;
	}

	public void setId(String id) {
		this.id = id;
	}
}