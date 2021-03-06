// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feed.Origin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feed.Origin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="ADWORDS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feed.Origin")
@XmlEnum
public enum FeedOrigin {


    /**
     * 
     *                 The {@link FeedAttribute}s for this {@link Feed} are managed by the user.
     *                 Users can add {@link FeedAttribute}s to this {@link Feed}.
     *               
     * 
     */
    USER,

    /**
     * 
     *                 The {@link FeedAttribute}s for an ADWORDS {@link Feed} are created
     *                 by ADWORDS. Occasionally the attributes defined for a particular type
     *                 of {@link Feed} is expanded. In this case, older {@link Feed}s of this
     *                 type can be mutated to add the expanded attributes.
     *               
     * 
     */
    ADWORDS,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedOrigin fromValue(String v) {
        return valueOf(v);
    }

}
