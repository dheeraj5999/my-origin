/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.image;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class alerts__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"alert alert-primary\" role=\"alert\">\n    A simple primary alert\u2014check it out!\n</div>\n<div class=\"alert alert-secondary\" role=\"alert\">\n    A simple secondary alert\u2014check it out!\n</div>\n<div class=\"alert alert-success\" role=\"alert\">\n    A simple success alert\u2014check it out!\n</div>\n<div class=\"alert alert-danger\" role=\"alert\">\n    A simple danger alert\u2014check it out!\n</div>\n<div class=\"alert alert-warning\" role=\"alert\">\n    A simple warning alert\u2014check it out!\n</div>\n<div class=\"alert alert-info\" role=\"alert\">\n    A simple info alert\u2014check it out!\n</div>\n<div class=\"alert alert-light\" role=\"alert\">\n    A simple light alert\u2014check it out!\n</div>\n<div class=\"alert alert-dark\" role=\"alert\">\n    A simple dark alert\u2014check it out!\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

