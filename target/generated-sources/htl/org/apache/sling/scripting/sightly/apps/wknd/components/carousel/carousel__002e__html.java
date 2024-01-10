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
package org.apache.sling.scripting.sightly.apps.wknd.components.carousel;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class carousel__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\"/>\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\n\n\n<div id=\"carouselExample\" class=\"carousel slide\">\n    <div class=\"carousel-inner\">\n        <div class=\"carousel-item active\">\n            <img src=\"...\" class=\"d-block w-100\" alt=\"...\"/>\n        </div>\n        <div class=\"carousel-item\">\n            <img src=\"...\" class=\"d-block w-100\" alt=\"...\"/>\n        </div>\n        <div class=\"carousel-item\">\n            <img src=\"...\" class=\"d-block w-100\" alt=\"...\"/>\n        </div>\n    </div>\n    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExample\" data-bs-slide=\"prev\">\n        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n        <span class=\"visually-hidden\">Previous</span>\n    </button>\n    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExample\" data-bs-slide=\"next\">\n        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n        <span class=\"visually-hidden\">Next</span>\n    </button>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

