// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SentenceAssessment model. */
@Fluent
public final class SentenceAssessment {
    /*
     * Assessment sentiment in the sentence.
     */
    @JsonProperty(value = "sentiment", required = true)
    private TokenSentimentValue sentiment;

    /*
     * Assessment sentiment confidence scores in the sentence.
     */
    @JsonProperty(value = "confidenceScores", required = true)
    private TargetConfidenceScoreLabel confidenceScores;

    /*
     * The assessment offset from the start of the sentence.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * The length of the assessment.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * The assessment text detected.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The indicator representing if the assessment is negated.
     */
    @JsonProperty(value = "isNegated", required = true)
    private boolean isNegated;

    /** Creates an instance of SentenceAssessment class. */
    public SentenceAssessment() {}

    /**
     * Get the sentiment property: Assessment sentiment in the sentence.
     *
     * @return the sentiment value.
     */
    public TokenSentimentValue getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: Assessment sentiment in the sentence.
     *
     * @param sentiment the sentiment value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setSentiment(TokenSentimentValue sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the confidenceScores property: Assessment sentiment confidence scores in the sentence.
     *
     * @return the confidenceScores value.
     */
    public TargetConfidenceScoreLabel getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Set the confidenceScores property: Assessment sentiment confidence scores in the sentence.
     *
     * @param confidenceScores the confidenceScores value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setConfidenceScores(TargetConfidenceScoreLabel confidenceScores) {
        this.confidenceScores = confidenceScores;
        return this;
    }

    /**
     * Get the offset property: The assessment offset from the start of the sentence.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The assessment offset from the start of the sentence.
     *
     * @param offset the offset value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the assessment.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the assessment.
     *
     * @param length the length value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the text property: The assessment text detected.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The assessment text detected.
     *
     * @param text the text value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the isNegated property: The indicator representing if the assessment is negated.
     *
     * @return the isNegated value.
     */
    public boolean isNegated() {
        return this.isNegated;
    }

    /**
     * Set the isNegated property: The indicator representing if the assessment is negated.
     *
     * @param isNegated the isNegated value to set.
     * @return the SentenceAssessment object itself.
     */
    public SentenceAssessment setIsNegated(boolean isNegated) {
        this.isNegated = isNegated;
        return this;
    }
}
