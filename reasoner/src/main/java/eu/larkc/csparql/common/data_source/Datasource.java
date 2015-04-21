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
package eu.larkc.csparql.common.data_source;

import java.util.List;

import eu.larkc.csparql.common.RDFTuple;

public interface Datasource {
	
	void putNamedModel(String namedModelURI, List<RDFTuple> modelContent);
	
	List<RDFTuple> getNamedModel(String namedModelURI);
	
	void removeNamedModel(String namedModelURI);
	
	void execUpdateQuery(String queryBody);
	
	List<RDFTuple> evaluateGeneralQuery(String queryBody);
	
	boolean containsNamedModel(String namedModelURI);


}