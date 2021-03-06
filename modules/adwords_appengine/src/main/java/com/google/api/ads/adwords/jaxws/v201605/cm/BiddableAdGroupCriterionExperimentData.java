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


package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data associated with an advertiser experiment for this {@link BiddableAdGroupCriterion}.
 *           
 * 
 * <p>Java class for BiddableAdGroupCriterionExperimentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddableAdGroupCriterionExperimentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="experimentDeltaStatus" type="{https://adwords.google.com/api/adwords/cm/v201605}ExperimentDeltaStatus" minOccurs="0"/>
 *         &lt;element name="experimentDataStatus" type="{https://adwords.google.com/api/adwords/cm/v201605}ExperimentDataStatus" minOccurs="0"/>
 *         &lt;element name="experimentBidMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201605}AdGroupCriterionExperimentBidMultiplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableAdGroupCriterionExperimentData", propOrder = {
    "experimentId",
    "experimentDeltaStatus",
    "experimentDataStatus",
    "experimentBidMultiplier"
})
public class BiddableAdGroupCriterionExperimentData {

    protected Long experimentId;
    @XmlSchemaType(name = "string")
    protected ExperimentDeltaStatus experimentDeltaStatus;
    @XmlSchemaType(name = "string")
    protected ExperimentDataStatus experimentDataStatus;
    protected AdGroupCriterionExperimentBidMultiplier experimentBidMultiplier;

    /**
     * Gets the value of the experimentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExperimentId() {
        return experimentId;
    }

    /**
     * Sets the value of the experimentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExperimentId(Long value) {
        this.experimentId = value;
    }

    /**
     * Gets the value of the experimentDeltaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentDeltaStatus }
     *     
     */
    public ExperimentDeltaStatus getExperimentDeltaStatus() {
        return experimentDeltaStatus;
    }

    /**
     * Sets the value of the experimentDeltaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentDeltaStatus }
     *     
     */
    public void setExperimentDeltaStatus(ExperimentDeltaStatus value) {
        this.experimentDeltaStatus = value;
    }

    /**
     * Gets the value of the experimentDataStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentDataStatus }
     *     
     */
    public ExperimentDataStatus getExperimentDataStatus() {
        return experimentDataStatus;
    }

    /**
     * Sets the value of the experimentDataStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentDataStatus }
     *     
     */
    public void setExperimentDataStatus(ExperimentDataStatus value) {
        this.experimentDataStatus = value;
    }

    /**
     * Gets the value of the experimentBidMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterionExperimentBidMultiplier }
     *     
     */
    public AdGroupCriterionExperimentBidMultiplier getExperimentBidMultiplier() {
        return experimentBidMultiplier;
    }

    /**
     * Sets the value of the experimentBidMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterionExperimentBidMultiplier }
     *     
     */
    public void setExperimentBidMultiplier(AdGroupCriterionExperimentBidMultiplier value) {
        this.experimentBidMultiplier = value;
    }

}
