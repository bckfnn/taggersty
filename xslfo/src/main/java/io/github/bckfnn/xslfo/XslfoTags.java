/*
 * Copyright 2015 [inno:vasion]
 */
package io.github.bckfnn.xslfo;

import io.github.bckfnn.taggersty.Tags;

public class XslfoTags extends Tags {

    public XslfoTags() {
        super(null);
    }

    /**
     * Generate a list of method for each html tag.
     *
     * @param args
     *            command arguments, not used.
     */
    public static void main(String[] args) {
        Tags.generate("fo", new String[] { "root", "declarations",
                "color-profile", "page-sequence", "page-sequence-wrapper",
                "layout-master-set", "page-sequence-master",
                "single-page-master-reference",
                "repeatable-page-master-reference",
                "repeatable-page-master-alternatives",
                "conditional-page-master-reference", "simple-page-master",
                "region-body", "region-before", "region-after", "region-start",
                "region-end",

                "flow", "static-content", "title", "flow-map",
                "flow-assignment", "flow-source-list", "flow-name-specifier",
                "flow-target-list", "region-name-specifier",

                "block", "block-container",

                "bidi-override", "character", "initial-property-set",
                "external-graphic", "instream-foreign-object", "inline",
                "inline-container", "leader", "page-number",
                "page-number-citation", "page-number-citation-last",
                "folio-prefix", "folio-suffix", "scaling-value-citation",

                "table-and-caption", "table", "table-column", "table-caption",
                "table-header", "table-footer", "table-body", "table-row",
                "table-cell",

                "list-block", "list-item", "list-item-body", "list-item-label",

                "basic-link", "multi-switch", "multi-case", "multi-toggle",
                "multi-properties", "multi-property-set",

                "index-page-number-prefix", "index-page-number-suffix",
                "index-range-begin", "index-range-end", "index-key-reference",
                "index-page-citation-list",
                "index-page-citation-list-separator",
                "index-page-citation-range-separator",

                "bookmark-tree", "bookmark", "bookmark-title",

                "float_", "footnote", "footnote-body",

                "change-bar-begin", "change-bar-end", "wrapper", "marker",
                "retrieve-marker", "retrieve-table-marker", });
    }
    
    private static final char[] _root = "fo:root".toCharArray();

    /**
     * Create an empty a @code{fo:root} tag
     */
    public void root() {
        tag(_root, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:root} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void root(String attr, String value) {
        tag(_root, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:root} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void root(String attr1, String value1, String attr2, String value2) {
        tag(_root, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:root} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void root(Tags.Generator body) {
        tag(_root, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:root} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void root(String attr, String value, Tags.Generator body) {
        tag(_root, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:root} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void root(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_root, attr1, value1, attr2, value2, body);
    }

    private static final char[] _declarations = "fo:declarations".toCharArray();

    /**
     * Create an empty a @code{fo:declarations} tag
     */
    public void declarations() {
        tag(_declarations, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:declarations} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void declarations(String attr, String value) {
        tag(_declarations, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:declarations} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void declarations(String attr1, String value1, String attr2, String value2) {
        tag(_declarations, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:declarations} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void declarations(Tags.Generator body) {
        tag(_declarations, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:declarations} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void declarations(String attr, String value, Tags.Generator body) {
        tag(_declarations, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:declarations} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void declarations(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_declarations, attr1, value1, attr2, value2, body);
    }

    private static final char[] _colorProfile = "fo:color-profile".toCharArray();

    /**
     * Create an empty a @code{fo:color-profile} tag
     */
    public void colorProfile() {
        tag(_colorProfile, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:color-profile} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void colorProfile(String attr, String value) {
        tag(_colorProfile, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:color-profile} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void colorProfile(String attr1, String value1, String attr2, String value2) {
        tag(_colorProfile, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:color-profile} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void colorProfile(Tags.Generator body) {
        tag(_colorProfile, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:color-profile} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void colorProfile(String attr, String value, Tags.Generator body) {
        tag(_colorProfile, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:color-profile} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void colorProfile(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_colorProfile, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageSequence = "fo:page-sequence".toCharArray();

    /**
     * Create an empty a @code{fo:page-sequence} tag
     */
    public void pageSequence() {
        tag(_pageSequence, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageSequence(String attr, String value) {
        tag(_pageSequence, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageSequence(String attr1, String value1, String attr2, String value2) {
        tag(_pageSequence, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-sequence} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageSequence(Tags.Generator body) {
        tag(_pageSequence, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequence(String attr, String value, Tags.Generator body) {
        tag(_pageSequence, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequence(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageSequence, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageSequenceWrapper = "fo:page-sequence-wrapper".toCharArray();

    /**
     * Create an empty a @code{fo:page-sequence-wrapper} tag
     */
    public void pageSequenceWrapper() {
        tag(_pageSequenceWrapper, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence-wrapper} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageSequenceWrapper(String attr, String value) {
        tag(_pageSequenceWrapper, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence-wrapper} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageSequenceWrapper(String attr1, String value1, String attr2, String value2) {
        tag(_pageSequenceWrapper, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-sequence-wrapper} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageSequenceWrapper(Tags.Generator body) {
        tag(_pageSequenceWrapper, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence-wrapper} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequenceWrapper(String attr, String value, Tags.Generator body) {
        tag(_pageSequenceWrapper, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence-wrapper} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequenceWrapper(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageSequenceWrapper, attr1, value1, attr2, value2, body);
    }

    private static final char[] _layoutMasterSet = "fo:layout-master-set".toCharArray();

    /**
     * Create an empty a @code{fo:layout-master-set} tag
     */
    public void layoutMasterSet() {
        tag(_layoutMasterSet, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:layout-master-set} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void layoutMasterSet(String attr, String value) {
        tag(_layoutMasterSet, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:layout-master-set} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void layoutMasterSet(String attr1, String value1, String attr2, String value2) {
        tag(_layoutMasterSet, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:layout-master-set} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void layoutMasterSet(Tags.Generator body) {
        tag(_layoutMasterSet, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:layout-master-set} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void layoutMasterSet(String attr, String value, Tags.Generator body) {
        tag(_layoutMasterSet, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:layout-master-set} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void layoutMasterSet(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_layoutMasterSet, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageSequenceMaster = "fo:page-sequence-master".toCharArray();

    /**
     * Create an empty a @code{fo:page-sequence-master} tag
     */
    public void pageSequenceMaster() {
        tag(_pageSequenceMaster, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence-master} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageSequenceMaster(String attr, String value) {
        tag(_pageSequenceMaster, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-sequence-master} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageSequenceMaster(String attr1, String value1, String attr2, String value2) {
        tag(_pageSequenceMaster, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-sequence-master} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageSequenceMaster(Tags.Generator body) {
        tag(_pageSequenceMaster, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence-master} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequenceMaster(String attr, String value, Tags.Generator body) {
        tag(_pageSequenceMaster, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-sequence-master} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageSequenceMaster(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageSequenceMaster, attr1, value1, attr2, value2, body);
    }

    private static final char[] _singlePageMasterReference = "fo:single-page-master-reference".toCharArray();

    /**
     * Create an empty a @code{fo:single-page-master-reference} tag
     */
    public void singlePageMasterReference() {
        tag(_singlePageMasterReference, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:single-page-master-reference} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void singlePageMasterReference(String attr, String value) {
        tag(_singlePageMasterReference, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:single-page-master-reference} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void singlePageMasterReference(String attr1, String value1, String attr2, String value2) {
        tag(_singlePageMasterReference, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:single-page-master-reference} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void singlePageMasterReference(Tags.Generator body) {
        tag(_singlePageMasterReference, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:single-page-master-reference} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void singlePageMasterReference(String attr, String value, Tags.Generator body) {
        tag(_singlePageMasterReference, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:single-page-master-reference} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void singlePageMasterReference(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_singlePageMasterReference, attr1, value1, attr2, value2, body);
    }

    private static final char[] _repeatablePageMasterReference = "fo:repeatable-page-master-reference".toCharArray();

    /**
     * Create an empty a @code{fo:repeatable-page-master-reference} tag
     */
    public void repeatablePageMasterReference() {
        tag(_repeatablePageMasterReference, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:repeatable-page-master-reference} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void repeatablePageMasterReference(String attr, String value) {
        tag(_repeatablePageMasterReference, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:repeatable-page-master-reference} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void repeatablePageMasterReference(String attr1, String value1, String attr2, String value2) {
        tag(_repeatablePageMasterReference, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:repeatable-page-master-reference} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterReference(Tags.Generator body) {
        tag(_repeatablePageMasterReference, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:repeatable-page-master-reference} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterReference(String attr, String value, Tags.Generator body) {
        tag(_repeatablePageMasterReference, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:repeatable-page-master-reference} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterReference(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_repeatablePageMasterReference, attr1, value1, attr2, value2, body);
    }

    private static final char[] _repeatablePageMasterAlternatives = "fo:repeatable-page-master-alternatives".toCharArray();

    /**
     * Create an empty a @code{fo:repeatable-page-master-alternatives} tag
     */
    public void repeatablePageMasterAlternatives() {
        tag(_repeatablePageMasterAlternatives, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:repeatable-page-master-alternatives} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void repeatablePageMasterAlternatives(String attr, String value) {
        tag(_repeatablePageMasterAlternatives, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:repeatable-page-master-alternatives} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void repeatablePageMasterAlternatives(String attr1, String value1, String attr2, String value2) {
        tag(_repeatablePageMasterAlternatives, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:repeatable-page-master-alternatives} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterAlternatives(Tags.Generator body) {
        tag(_repeatablePageMasterAlternatives, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:repeatable-page-master-alternatives} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterAlternatives(String attr, String value, Tags.Generator body) {
        tag(_repeatablePageMasterAlternatives, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:repeatable-page-master-alternatives} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void repeatablePageMasterAlternatives(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_repeatablePageMasterAlternatives, attr1, value1, attr2, value2, body);
    }

    private static final char[] _conditionalPageMasterReference = "fo:conditional-page-master-reference".toCharArray();

    /**
     * Create an empty a @code{fo:conditional-page-master-reference} tag
     */
    public void conditionalPageMasterReference() {
        tag(_conditionalPageMasterReference, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:conditional-page-master-reference} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void conditionalPageMasterReference(String attr, String value) {
        tag(_conditionalPageMasterReference, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:conditional-page-master-reference} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void conditionalPageMasterReference(String attr1, String value1, String attr2, String value2) {
        tag(_conditionalPageMasterReference, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:conditional-page-master-reference} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void conditionalPageMasterReference(Tags.Generator body) {
        tag(_conditionalPageMasterReference, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:conditional-page-master-reference} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void conditionalPageMasterReference(String attr, String value, Tags.Generator body) {
        tag(_conditionalPageMasterReference, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:conditional-page-master-reference} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void conditionalPageMasterReference(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_conditionalPageMasterReference, attr1, value1, attr2, value2, body);
    }

    private static final char[] _simplePageMaster = "fo:simple-page-master".toCharArray();

    /**
     * Create an empty a @code{fo:simple-page-master} tag
     */
    public void simplePageMaster() {
        tag(_simplePageMaster, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:simple-page-master} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void simplePageMaster(String attr, String value) {
        tag(_simplePageMaster, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:simple-page-master} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void simplePageMaster(String attr1, String value1, String attr2, String value2) {
        tag(_simplePageMaster, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:simple-page-master} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void simplePageMaster(Tags.Generator body) {
        tag(_simplePageMaster, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:simple-page-master} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void simplePageMaster(String attr, String value, Tags.Generator body) {
        tag(_simplePageMaster, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:simple-page-master} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void simplePageMaster(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_simplePageMaster, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionBody = "fo:region-body".toCharArray();

    /**
     * Create an empty a @code{fo:region-body} tag
     */
    public void regionBody() {
        tag(_regionBody, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-body} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionBody(String attr, String value) {
        tag(_regionBody, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-body} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionBody(String attr1, String value1, String attr2, String value2) {
        tag(_regionBody, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-body} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionBody(Tags.Generator body) {
        tag(_regionBody, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-body} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionBody(String attr, String value, Tags.Generator body) {
        tag(_regionBody, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-body} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionBody(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionBody, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionBefore = "fo:region-before".toCharArray();

    /**
     * Create an empty a @code{fo:region-before} tag
     */
    public void regionBefore() {
        tag(_regionBefore, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-before} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionBefore(String attr, String value) {
        tag(_regionBefore, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-before} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionBefore(String attr1, String value1, String attr2, String value2) {
        tag(_regionBefore, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-before} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionBefore(Tags.Generator body) {
        tag(_regionBefore, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-before} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionBefore(String attr, String value, Tags.Generator body) {
        tag(_regionBefore, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-before} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionBefore(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionBefore, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionAfter = "fo:region-after".toCharArray();

    /**
     * Create an empty a @code{fo:region-after} tag
     */
    public void regionAfter() {
        tag(_regionAfter, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-after} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionAfter(String attr, String value) {
        tag(_regionAfter, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-after} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionAfter(String attr1, String value1, String attr2, String value2) {
        tag(_regionAfter, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-after} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionAfter(Tags.Generator body) {
        tag(_regionAfter, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-after} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionAfter(String attr, String value, Tags.Generator body) {
        tag(_regionAfter, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-after} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionAfter(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionAfter, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionStart = "fo:region-start".toCharArray();

    /**
     * Create an empty a @code{fo:region-start} tag
     */
    public void regionStart() {
        tag(_regionStart, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-start} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionStart(String attr, String value) {
        tag(_regionStart, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-start} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionStart(String attr1, String value1, String attr2, String value2) {
        tag(_regionStart, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-start} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionStart(Tags.Generator body) {
        tag(_regionStart, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-start} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionStart(String attr, String value, Tags.Generator body) {
        tag(_regionStart, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-start} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionStart(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionStart, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionEnd = "fo:region-end".toCharArray();

    /**
     * Create an empty a @code{fo:region-end} tag
     */
    public void regionEnd() {
        tag(_regionEnd, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-end} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionEnd(String attr, String value) {
        tag(_regionEnd, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-end} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionEnd(String attr1, String value1, String attr2, String value2) {
        tag(_regionEnd, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-end} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionEnd(Tags.Generator body) {
        tag(_regionEnd, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-end} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionEnd(String attr, String value, Tags.Generator body) {
        tag(_regionEnd, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-end} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionEnd(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionEnd, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flow = "fo:flow".toCharArray();

    /**
     * Create an empty a @code{fo:flow} tag
     */
    public void flow() {
        tag(_flow, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flow(String attr, String value) {
        tag(_flow, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flow(String attr1, String value1, String attr2, String value2) {
        tag(_flow, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flow(Tags.Generator body) {
        tag(_flow, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flow(String attr, String value, Tags.Generator body) {
        tag(_flow, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flow(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flow, attr1, value1, attr2, value2, body);
    }

    private static final char[] _staticContent = "fo:static-content".toCharArray();

    /**
     * Create an empty a @code{fo:static-content} tag
     */
    public void staticContent() {
        tag(_staticContent, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:static-content} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void staticContent(String attr, String value) {
        tag(_staticContent, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:static-content} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void staticContent(String attr1, String value1, String attr2, String value2) {
        tag(_staticContent, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:static-content} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void staticContent(Tags.Generator body) {
        tag(_staticContent, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:static-content} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void staticContent(String attr, String value, Tags.Generator body) {
        tag(_staticContent, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:static-content} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void staticContent(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_staticContent, attr1, value1, attr2, value2, body);
    }

    private static final char[] _title = "fo:title".toCharArray();

    /**
     * Create an empty a @code{fo:title} tag
     */
    public void title() {
        tag(_title, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:title} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void title(String attr, String value) {
        tag(_title, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:title} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void title(String attr1, String value1, String attr2, String value2) {
        tag(_title, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:title} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void title(Tags.Generator body) {
        tag(_title, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:title} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void title(String attr, String value, Tags.Generator body) {
        tag(_title, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:title} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void title(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_title, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flowMap = "fo:flow-map".toCharArray();

    /**
     * Create an empty a @code{fo:flow-map} tag
     */
    public void flowMap() {
        tag(_flowMap, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-map} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flowMap(String attr, String value) {
        tag(_flowMap, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-map} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flowMap(String attr1, String value1, String attr2, String value2) {
        tag(_flowMap, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow-map} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flowMap(Tags.Generator body) {
        tag(_flowMap, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow-map} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flowMap(String attr, String value, Tags.Generator body) {
        tag(_flowMap, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow-map} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flowMap(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flowMap, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flowAssignment = "fo:flow-assignment".toCharArray();

    /**
     * Create an empty a @code{fo:flow-assignment} tag
     */
    public void flowAssignment() {
        tag(_flowAssignment, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-assignment} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flowAssignment(String attr, String value) {
        tag(_flowAssignment, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-assignment} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flowAssignment(String attr1, String value1, String attr2, String value2) {
        tag(_flowAssignment, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow-assignment} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flowAssignment(Tags.Generator body) {
        tag(_flowAssignment, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow-assignment} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flowAssignment(String attr, String value, Tags.Generator body) {
        tag(_flowAssignment, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow-assignment} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flowAssignment(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flowAssignment, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flowSourceList = "fo:flow-source-list".toCharArray();

    /**
     * Create an empty a @code{fo:flow-source-list} tag
     */
    public void flowSourceList() {
        tag(_flowSourceList, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-source-list} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flowSourceList(String attr, String value) {
        tag(_flowSourceList, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-source-list} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flowSourceList(String attr1, String value1, String attr2, String value2) {
        tag(_flowSourceList, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow-source-list} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flowSourceList(Tags.Generator body) {
        tag(_flowSourceList, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow-source-list} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flowSourceList(String attr, String value, Tags.Generator body) {
        tag(_flowSourceList, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow-source-list} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flowSourceList(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flowSourceList, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flowNameSpecifier = "fo:flow-name-specifier".toCharArray();

    /**
     * Create an empty a @code{fo:flow-name-specifier} tag
     */
    public void flowNameSpecifier() {
        tag(_flowNameSpecifier, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-name-specifier} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flowNameSpecifier(String attr, String value) {
        tag(_flowNameSpecifier, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-name-specifier} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flowNameSpecifier(String attr1, String value1, String attr2, String value2) {
        tag(_flowNameSpecifier, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow-name-specifier} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flowNameSpecifier(Tags.Generator body) {
        tag(_flowNameSpecifier, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow-name-specifier} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flowNameSpecifier(String attr, String value, Tags.Generator body) {
        tag(_flowNameSpecifier, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow-name-specifier} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flowNameSpecifier(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flowNameSpecifier, attr1, value1, attr2, value2, body);
    }

    private static final char[] _flowTargetList = "fo:flow-target-list".toCharArray();

    /**
     * Create an empty a @code{fo:flow-target-list} tag
     */
    public void flowTargetList() {
        tag(_flowTargetList, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-target-list} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void flowTargetList(String attr, String value) {
        tag(_flowTargetList, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:flow-target-list} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void flowTargetList(String attr1, String value1, String attr2, String value2) {
        tag(_flowTargetList, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:flow-target-list} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void flowTargetList(Tags.Generator body) {
        tag(_flowTargetList, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:flow-target-list} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void flowTargetList(String attr, String value, Tags.Generator body) {
        tag(_flowTargetList, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:flow-target-list} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void flowTargetList(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_flowTargetList, attr1, value1, attr2, value2, body);
    }

    private static final char[] _regionNameSpecifier = "fo:region-name-specifier".toCharArray();

    /**
     * Create an empty a @code{fo:region-name-specifier} tag
     */
    public void regionNameSpecifier() {
        tag(_regionNameSpecifier, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-name-specifier} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void regionNameSpecifier(String attr, String value) {
        tag(_regionNameSpecifier, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:region-name-specifier} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void regionNameSpecifier(String attr1, String value1, String attr2, String value2) {
        tag(_regionNameSpecifier, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:region-name-specifier} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void regionNameSpecifier(Tags.Generator body) {
        tag(_regionNameSpecifier, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:region-name-specifier} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void regionNameSpecifier(String attr, String value, Tags.Generator body) {
        tag(_regionNameSpecifier, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:region-name-specifier} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void regionNameSpecifier(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_regionNameSpecifier, attr1, value1, attr2, value2, body);
    }

    private static final char[] _block = "fo:block".toCharArray();

    /**
     * Create an empty a @code{fo:block} tag
     */
    public void block() {
        tag(_block, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:block} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void block(String attr, String value) {
        tag(_block, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:block} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void block(String attr1, String value1, String attr2, String value2) {
        tag(_block, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:block} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void block(Tags.Generator body) {
        tag(_block, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:block} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void block(String attr, String value, Tags.Generator body) {
        tag(_block, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:block} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void block(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_block, attr1, value1, attr2, value2, body);
    }

    private static final char[] _blockContainer = "fo:block-container".toCharArray();

    /**
     * Create an empty a @code{fo:block-container} tag
     */
    public void blockContainer() {
        tag(_blockContainer, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:block-container} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void blockContainer(String attr, String value) {
        tag(_blockContainer, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:block-container} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void blockContainer(String attr1, String value1, String attr2, String value2) {
        tag(_blockContainer, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:block-container} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void blockContainer(Tags.Generator body) {
        tag(_blockContainer, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:block-container} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void blockContainer(String attr, String value, Tags.Generator body) {
        tag(_blockContainer, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:block-container} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void blockContainer(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_blockContainer, attr1, value1, attr2, value2, body);
    }

    private static final char[] _bidiOverride = "fo:bidi-override".toCharArray();

    /**
     * Create an empty a @code{fo:bidi-override} tag
     */
    public void bidiOverride() {
        tag(_bidiOverride, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bidi-override} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void bidiOverride(String attr, String value) {
        tag(_bidiOverride, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bidi-override} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void bidiOverride(String attr1, String value1, String attr2, String value2) {
        tag(_bidiOverride, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:bidi-override} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void bidiOverride(Tags.Generator body) {
        tag(_bidiOverride, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:bidi-override} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void bidiOverride(String attr, String value, Tags.Generator body) {
        tag(_bidiOverride, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:bidi-override} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void bidiOverride(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_bidiOverride, attr1, value1, attr2, value2, body);
    }

    private static final char[] _character = "fo:character".toCharArray();

    /**
     * Create an empty a @code{fo:character} tag
     */
    public void character() {
        tag(_character, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:character} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void character(String attr, String value) {
        tag(_character, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:character} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void character(String attr1, String value1, String attr2, String value2) {
        tag(_character, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:character} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void character(Tags.Generator body) {
        tag(_character, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:character} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void character(String attr, String value, Tags.Generator body) {
        tag(_character, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:character} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void character(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_character, attr1, value1, attr2, value2, body);
    }

    private static final char[] _initialPropertySet = "fo:initial-property-set".toCharArray();

    /**
     * Create an empty a @code{fo:initial-property-set} tag
     */
    public void initialPropertySet() {
        tag(_initialPropertySet, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:initial-property-set} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void initialPropertySet(String attr, String value) {
        tag(_initialPropertySet, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:initial-property-set} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void initialPropertySet(String attr1, String value1, String attr2, String value2) {
        tag(_initialPropertySet, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:initial-property-set} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void initialPropertySet(Tags.Generator body) {
        tag(_initialPropertySet, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:initial-property-set} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void initialPropertySet(String attr, String value, Tags.Generator body) {
        tag(_initialPropertySet, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:initial-property-set} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void initialPropertySet(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_initialPropertySet, attr1, value1, attr2, value2, body);
    }

    private static final char[] _externalGraphic = "fo:external-graphic".toCharArray();

    /**
     * Create an empty a @code{fo:external-graphic} tag
     */
    public void externalGraphic() {
        tag(_externalGraphic, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:external-graphic} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void externalGraphic(String attr, String value) {
        tag(_externalGraphic, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:external-graphic} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void externalGraphic(String attr1, String value1, String attr2, String value2) {
        tag(_externalGraphic, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:external-graphic} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void externalGraphic(Tags.Generator body) {
        tag(_externalGraphic, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:external-graphic} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void externalGraphic(String attr, String value, Tags.Generator body) {
        tag(_externalGraphic, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:external-graphic} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void externalGraphic(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_externalGraphic, attr1, value1, attr2, value2, body);
    }

    private static final char[] _instreamForeignObject = "fo:instream-foreign-object".toCharArray();

    /**
     * Create an empty a @code{fo:instream-foreign-object} tag
     */
    public void instreamForeignObject() {
        tag(_instreamForeignObject, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:instream-foreign-object} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void instreamForeignObject(String attr, String value) {
        tag(_instreamForeignObject, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:instream-foreign-object} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void instreamForeignObject(String attr1, String value1, String attr2, String value2) {
        tag(_instreamForeignObject, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:instream-foreign-object} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void instreamForeignObject(Tags.Generator body) {
        tag(_instreamForeignObject, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:instream-foreign-object} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void instreamForeignObject(String attr, String value, Tags.Generator body) {
        tag(_instreamForeignObject, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:instream-foreign-object} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void instreamForeignObject(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_instreamForeignObject, attr1, value1, attr2, value2, body);
    }

    private static final char[] _inline = "fo:inline".toCharArray();

    /**
     * Create an empty a @code{fo:inline} tag
     */
    public void inline() {
        tag(_inline, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:inline} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void inline(String attr, String value) {
        tag(_inline, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:inline} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void inline(String attr1, String value1, String attr2, String value2) {
        tag(_inline, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:inline} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void inline(Tags.Generator body) {
        tag(_inline, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:inline} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void inline(String attr, String value, Tags.Generator body) {
        tag(_inline, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:inline} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void inline(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_inline, attr1, value1, attr2, value2, body);
    }

    private static final char[] _inlineContainer = "fo:inline-container".toCharArray();

    /**
     * Create an empty a @code{fo:inline-container} tag
     */
    public void inlineContainer() {
        tag(_inlineContainer, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:inline-container} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void inlineContainer(String attr, String value) {
        tag(_inlineContainer, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:inline-container} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void inlineContainer(String attr1, String value1, String attr2, String value2) {
        tag(_inlineContainer, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:inline-container} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void inlineContainer(Tags.Generator body) {
        tag(_inlineContainer, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:inline-container} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void inlineContainer(String attr, String value, Tags.Generator body) {
        tag(_inlineContainer, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:inline-container} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void inlineContainer(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_inlineContainer, attr1, value1, attr2, value2, body);
    }

    private static final char[] _leader = "fo:leader".toCharArray();

    /**
     * Create an empty a @code{fo:leader} tag
     */
    public void leader() {
        tag(_leader, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:leader} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void leader(String attr, String value) {
        tag(_leader, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:leader} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void leader(String attr1, String value1, String attr2, String value2) {
        tag(_leader, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:leader} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void leader(Tags.Generator body) {
        tag(_leader, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:leader} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void leader(String attr, String value, Tags.Generator body) {
        tag(_leader, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:leader} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void leader(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_leader, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageNumber = "fo:page-number".toCharArray();

    /**
     * Create an empty a @code{fo:page-number} tag
     */
    public void pageNumber() {
        tag(_pageNumber, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageNumber(String attr, String value) {
        tag(_pageNumber, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageNumber(String attr1, String value1, String attr2, String value2) {
        tag(_pageNumber, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-number} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageNumber(Tags.Generator body) {
        tag(_pageNumber, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-number} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumber(String attr, String value, Tags.Generator body) {
        tag(_pageNumber, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-number} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumber(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageNumber, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageNumberCitation = "fo:page-number-citation".toCharArray();

    /**
     * Create an empty a @code{fo:page-number-citation} tag
     */
    public void pageNumberCitation() {
        tag(_pageNumberCitation, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number-citation} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageNumberCitation(String attr, String value) {
        tag(_pageNumberCitation, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number-citation} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageNumberCitation(String attr1, String value1, String attr2, String value2) {
        tag(_pageNumberCitation, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-number-citation} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageNumberCitation(Tags.Generator body) {
        tag(_pageNumberCitation, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-number-citation} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumberCitation(String attr, String value, Tags.Generator body) {
        tag(_pageNumberCitation, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-number-citation} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumberCitation(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageNumberCitation, attr1, value1, attr2, value2, body);
    }

    private static final char[] _pageNumberCitationLast = "fo:page-number-citation-last".toCharArray();

    /**
     * Create an empty a @code{fo:page-number-citation-last} tag
     */
    public void pageNumberCitationLast() {
        tag(_pageNumberCitationLast, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number-citation-last} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void pageNumberCitationLast(String attr, String value) {
        tag(_pageNumberCitationLast, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:page-number-citation-last} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void pageNumberCitationLast(String attr1, String value1, String attr2, String value2) {
        tag(_pageNumberCitationLast, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:page-number-citation-last} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void pageNumberCitationLast(Tags.Generator body) {
        tag(_pageNumberCitationLast, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:page-number-citation-last} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumberCitationLast(String attr, String value, Tags.Generator body) {
        tag(_pageNumberCitationLast, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:page-number-citation-last} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void pageNumberCitationLast(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_pageNumberCitationLast, attr1, value1, attr2, value2, body);
    }

    private static final char[] _folioPrefix = "fo:folio-prefix".toCharArray();

    /**
     * Create an empty a @code{fo:folio-prefix} tag
     */
    public void folioPrefix() {
        tag(_folioPrefix, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:folio-prefix} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void folioPrefix(String attr, String value) {
        tag(_folioPrefix, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:folio-prefix} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void folioPrefix(String attr1, String value1, String attr2, String value2) {
        tag(_folioPrefix, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:folio-prefix} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void folioPrefix(Tags.Generator body) {
        tag(_folioPrefix, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:folio-prefix} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void folioPrefix(String attr, String value, Tags.Generator body) {
        tag(_folioPrefix, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:folio-prefix} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void folioPrefix(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_folioPrefix, attr1, value1, attr2, value2, body);
    }

    private static final char[] _folioSuffix = "fo:folio-suffix".toCharArray();

    /**
     * Create an empty a @code{fo:folio-suffix} tag
     */
    public void folioSuffix() {
        tag(_folioSuffix, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:folio-suffix} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void folioSuffix(String attr, String value) {
        tag(_folioSuffix, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:folio-suffix} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void folioSuffix(String attr1, String value1, String attr2, String value2) {
        tag(_folioSuffix, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:folio-suffix} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void folioSuffix(Tags.Generator body) {
        tag(_folioSuffix, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:folio-suffix} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void folioSuffix(String attr, String value, Tags.Generator body) {
        tag(_folioSuffix, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:folio-suffix} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void folioSuffix(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_folioSuffix, attr1, value1, attr2, value2, body);
    }

    private static final char[] _scalingValueCitation = "fo:scaling-value-citation".toCharArray();

    /**
     * Create an empty a @code{fo:scaling-value-citation} tag
     */
    public void scalingValueCitation() {
        tag(_scalingValueCitation, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:scaling-value-citation} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void scalingValueCitation(String attr, String value) {
        tag(_scalingValueCitation, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:scaling-value-citation} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void scalingValueCitation(String attr1, String value1, String attr2, String value2) {
        tag(_scalingValueCitation, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:scaling-value-citation} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void scalingValueCitation(Tags.Generator body) {
        tag(_scalingValueCitation, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:scaling-value-citation} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void scalingValueCitation(String attr, String value, Tags.Generator body) {
        tag(_scalingValueCitation, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:scaling-value-citation} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void scalingValueCitation(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_scalingValueCitation, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableAndCaption = "fo:table-and-caption".toCharArray();

    /**
     * Create an empty a @code{fo:table-and-caption} tag
     */
    public void tableAndCaption() {
        tag(_tableAndCaption, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-and-caption} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableAndCaption(String attr, String value) {
        tag(_tableAndCaption, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-and-caption} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableAndCaption(String attr1, String value1, String attr2, String value2) {
        tag(_tableAndCaption, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-and-caption} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableAndCaption(Tags.Generator body) {
        tag(_tableAndCaption, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-and-caption} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableAndCaption(String attr, String value, Tags.Generator body) {
        tag(_tableAndCaption, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-and-caption} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableAndCaption(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableAndCaption, attr1, value1, attr2, value2, body);
    }

    private static final char[] _table = "fo:table".toCharArray();

    /**
     * Create an empty a @code{fo:table} tag
     */
    public void table() {
        tag(_table, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void table(String attr, String value) {
        tag(_table, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void table(String attr1, String value1, String attr2, String value2) {
        tag(_table, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void table(Tags.Generator body) {
        tag(_table, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void table(String attr, String value, Tags.Generator body) {
        tag(_table, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void table(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_table, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableColumn = "fo:table-column".toCharArray();

    /**
     * Create an empty a @code{fo:table-column} tag
     */
    public void tableColumn() {
        tag(_tableColumn, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-column} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableColumn(String attr, String value) {
        tag(_tableColumn, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-column} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableColumn(String attr1, String value1, String attr2, String value2) {
        tag(_tableColumn, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-column} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableColumn(Tags.Generator body) {
        tag(_tableColumn, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-column} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableColumn(String attr, String value, Tags.Generator body) {
        tag(_tableColumn, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-column} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableColumn(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableColumn, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableCaption = "fo:table-caption".toCharArray();

    /**
     * Create an empty a @code{fo:table-caption} tag
     */
    public void tableCaption() {
        tag(_tableCaption, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-caption} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableCaption(String attr, String value) {
        tag(_tableCaption, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-caption} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableCaption(String attr1, String value1, String attr2, String value2) {
        tag(_tableCaption, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-caption} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableCaption(Tags.Generator body) {
        tag(_tableCaption, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-caption} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableCaption(String attr, String value, Tags.Generator body) {
        tag(_tableCaption, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-caption} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableCaption(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableCaption, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableHeader = "fo:table-header".toCharArray();

    /**
     * Create an empty a @code{fo:table-header} tag
     */
    public void tableHeader() {
        tag(_tableHeader, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-header} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableHeader(String attr, String value) {
        tag(_tableHeader, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-header} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableHeader(String attr1, String value1, String attr2, String value2) {
        tag(_tableHeader, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-header} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableHeader(Tags.Generator body) {
        tag(_tableHeader, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-header} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableHeader(String attr, String value, Tags.Generator body) {
        tag(_tableHeader, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-header} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableHeader(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableHeader, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableFooter = "fo:table-footer".toCharArray();

    /**
     * Create an empty a @code{fo:table-footer} tag
     */
    public void tableFooter() {
        tag(_tableFooter, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-footer} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableFooter(String attr, String value) {
        tag(_tableFooter, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-footer} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableFooter(String attr1, String value1, String attr2, String value2) {
        tag(_tableFooter, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-footer} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableFooter(Tags.Generator body) {
        tag(_tableFooter, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-footer} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableFooter(String attr, String value, Tags.Generator body) {
        tag(_tableFooter, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-footer} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableFooter(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableFooter, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableBody = "fo:table-body".toCharArray();

    /**
     * Create an empty a @code{fo:table-body} tag
     */
    public void tableBody() {
        tag(_tableBody, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-body} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableBody(String attr, String value) {
        tag(_tableBody, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-body} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableBody(String attr1, String value1, String attr2, String value2) {
        tag(_tableBody, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-body} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableBody(Tags.Generator body) {
        tag(_tableBody, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-body} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableBody(String attr, String value, Tags.Generator body) {
        tag(_tableBody, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-body} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableBody(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableBody, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableRow = "fo:table-row".toCharArray();

    /**
     * Create an empty a @code{fo:table-row} tag
     */
    public void tableRow() {
        tag(_tableRow, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-row} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableRow(String attr, String value) {
        tag(_tableRow, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-row} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableRow(String attr1, String value1, String attr2, String value2) {
        tag(_tableRow, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-row} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableRow(Tags.Generator body) {
        tag(_tableRow, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-row} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableRow(String attr, String value, Tags.Generator body) {
        tag(_tableRow, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-row} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableRow(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableRow, attr1, value1, attr2, value2, body);
    }

    private static final char[] _tableCell = "fo:table-cell".toCharArray();

    /**
     * Create an empty a @code{fo:table-cell} tag
     */
    public void tableCell() {
        tag(_tableCell, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-cell} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void tableCell(String attr, String value) {
        tag(_tableCell, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:table-cell} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void tableCell(String attr1, String value1, String attr2, String value2) {
        tag(_tableCell, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:table-cell} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void tableCell(Tags.Generator body) {
        tag(_tableCell, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:table-cell} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void tableCell(String attr, String value, Tags.Generator body) {
        tag(_tableCell, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:table-cell} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void tableCell(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_tableCell, attr1, value1, attr2, value2, body);
    }

    private static final char[] _listBlock = "fo:list-block".toCharArray();

    /**
     * Create an empty a @code{fo:list-block} tag
     */
    public void listBlock() {
        tag(_listBlock, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-block} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void listBlock(String attr, String value) {
        tag(_listBlock, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-block} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void listBlock(String attr1, String value1, String attr2, String value2) {
        tag(_listBlock, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:list-block} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void listBlock(Tags.Generator body) {
        tag(_listBlock, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:list-block} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void listBlock(String attr, String value, Tags.Generator body) {
        tag(_listBlock, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:list-block} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void listBlock(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_listBlock, attr1, value1, attr2, value2, body);
    }

    private static final char[] _listItem = "fo:list-item".toCharArray();

    /**
     * Create an empty a @code{fo:list-item} tag
     */
    public void listItem() {
        tag(_listItem, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void listItem(String attr, String value) {
        tag(_listItem, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void listItem(String attr1, String value1, String attr2, String value2) {
        tag(_listItem, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:list-item} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void listItem(Tags.Generator body) {
        tag(_listItem, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:list-item} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void listItem(String attr, String value, Tags.Generator body) {
        tag(_listItem, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:list-item} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void listItem(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_listItem, attr1, value1, attr2, value2, body);
    }

    private static final char[] _listItemBody = "fo:list-item-body".toCharArray();

    /**
     * Create an empty a @code{fo:list-item-body} tag
     */
    public void listItemBody() {
        tag(_listItemBody, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item-body} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void listItemBody(String attr, String value) {
        tag(_listItemBody, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item-body} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void listItemBody(String attr1, String value1, String attr2, String value2) {
        tag(_listItemBody, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:list-item-body} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void listItemBody(Tags.Generator body) {
        tag(_listItemBody, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:list-item-body} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void listItemBody(String attr, String value, Tags.Generator body) {
        tag(_listItemBody, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:list-item-body} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void listItemBody(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_listItemBody, attr1, value1, attr2, value2, body);
    }

    private static final char[] _listItemLabel = "fo:list-item-label".toCharArray();

    /**
     * Create an empty a @code{fo:list-item-label} tag
     */
    public void listItemLabel() {
        tag(_listItemLabel, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item-label} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void listItemLabel(String attr, String value) {
        tag(_listItemLabel, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:list-item-label} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void listItemLabel(String attr1, String value1, String attr2, String value2) {
        tag(_listItemLabel, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:list-item-label} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void listItemLabel(Tags.Generator body) {
        tag(_listItemLabel, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:list-item-label} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void listItemLabel(String attr, String value, Tags.Generator body) {
        tag(_listItemLabel, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:list-item-label} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void listItemLabel(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_listItemLabel, attr1, value1, attr2, value2, body);
    }

    private static final char[] _basicLink = "fo:basic-link".toCharArray();

    /**
     * Create an empty a @code{fo:basic-link} tag
     */
    public void basicLink() {
        tag(_basicLink, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:basic-link} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void basicLink(String attr, String value) {
        tag(_basicLink, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:basic-link} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void basicLink(String attr1, String value1, String attr2, String value2) {
        tag(_basicLink, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:basic-link} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void basicLink(Tags.Generator body) {
        tag(_basicLink, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:basic-link} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void basicLink(String attr, String value, Tags.Generator body) {
        tag(_basicLink, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:basic-link} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void basicLink(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_basicLink, attr1, value1, attr2, value2, body);
    }

    private static final char[] _multiSwitch = "fo:multi-switch".toCharArray();

    /**
     * Create an empty a @code{fo:multi-switch} tag
     */
    public void multiSwitch() {
        tag(_multiSwitch, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-switch} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void multiSwitch(String attr, String value) {
        tag(_multiSwitch, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-switch} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void multiSwitch(String attr1, String value1, String attr2, String value2) {
        tag(_multiSwitch, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:multi-switch} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void multiSwitch(Tags.Generator body) {
        tag(_multiSwitch, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:multi-switch} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void multiSwitch(String attr, String value, Tags.Generator body) {
        tag(_multiSwitch, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:multi-switch} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void multiSwitch(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_multiSwitch, attr1, value1, attr2, value2, body);
    }

    private static final char[] _multiCase = "fo:multi-case".toCharArray();

    /**
     * Create an empty a @code{fo:multi-case} tag
     */
    public void multiCase() {
        tag(_multiCase, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-case} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void multiCase(String attr, String value) {
        tag(_multiCase, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-case} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void multiCase(String attr1, String value1, String attr2, String value2) {
        tag(_multiCase, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:multi-case} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void multiCase(Tags.Generator body) {
        tag(_multiCase, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:multi-case} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void multiCase(String attr, String value, Tags.Generator body) {
        tag(_multiCase, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:multi-case} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void multiCase(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_multiCase, attr1, value1, attr2, value2, body);
    }

    private static final char[] _multiToggle = "fo:multi-toggle".toCharArray();

    /**
     * Create an empty a @code{fo:multi-toggle} tag
     */
    public void multiToggle() {
        tag(_multiToggle, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-toggle} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void multiToggle(String attr, String value) {
        tag(_multiToggle, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-toggle} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void multiToggle(String attr1, String value1, String attr2, String value2) {
        tag(_multiToggle, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:multi-toggle} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void multiToggle(Tags.Generator body) {
        tag(_multiToggle, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:multi-toggle} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void multiToggle(String attr, String value, Tags.Generator body) {
        tag(_multiToggle, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:multi-toggle} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void multiToggle(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_multiToggle, attr1, value1, attr2, value2, body);
    }

    private static final char[] _multiProperties = "fo:multi-properties".toCharArray();

    /**
     * Create an empty a @code{fo:multi-properties} tag
     */
    public void multiProperties() {
        tag(_multiProperties, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-properties} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void multiProperties(String attr, String value) {
        tag(_multiProperties, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-properties} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void multiProperties(String attr1, String value1, String attr2, String value2) {
        tag(_multiProperties, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:multi-properties} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void multiProperties(Tags.Generator body) {
        tag(_multiProperties, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:multi-properties} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void multiProperties(String attr, String value, Tags.Generator body) {
        tag(_multiProperties, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:multi-properties} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void multiProperties(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_multiProperties, attr1, value1, attr2, value2, body);
    }

    private static final char[] _multiPropertySet = "fo:multi-property-set".toCharArray();

    /**
     * Create an empty a @code{fo:multi-property-set} tag
     */
    public void multiPropertySet() {
        tag(_multiPropertySet, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-property-set} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void multiPropertySet(String attr, String value) {
        tag(_multiPropertySet, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:multi-property-set} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void multiPropertySet(String attr1, String value1, String attr2, String value2) {
        tag(_multiPropertySet, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:multi-property-set} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void multiPropertySet(Tags.Generator body) {
        tag(_multiPropertySet, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:multi-property-set} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void multiPropertySet(String attr, String value, Tags.Generator body) {
        tag(_multiPropertySet, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:multi-property-set} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void multiPropertySet(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_multiPropertySet, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexPageNumberPrefix = "fo:index-page-number-prefix".toCharArray();

    /**
     * Create an empty a @code{fo:index-page-number-prefix} tag
     */
    public void indexPageNumberPrefix() {
        tag(_indexPageNumberPrefix, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-number-prefix} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexPageNumberPrefix(String attr, String value) {
        tag(_indexPageNumberPrefix, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-number-prefix} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexPageNumberPrefix(String attr1, String value1, String attr2, String value2) {
        tag(_indexPageNumberPrefix, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-page-number-prefix} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexPageNumberPrefix(Tags.Generator body) {
        tag(_indexPageNumberPrefix, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-number-prefix} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageNumberPrefix(String attr, String value, Tags.Generator body) {
        tag(_indexPageNumberPrefix, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-number-prefix} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageNumberPrefix(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexPageNumberPrefix, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexPageNumberSuffix = "fo:index-page-number-suffix".toCharArray();

    /**
     * Create an empty a @code{fo:index-page-number-suffix} tag
     */
    public void indexPageNumberSuffix() {
        tag(_indexPageNumberSuffix, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-number-suffix} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexPageNumberSuffix(String attr, String value) {
        tag(_indexPageNumberSuffix, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-number-suffix} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexPageNumberSuffix(String attr1, String value1, String attr2, String value2) {
        tag(_indexPageNumberSuffix, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-page-number-suffix} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexPageNumberSuffix(Tags.Generator body) {
        tag(_indexPageNumberSuffix, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-number-suffix} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageNumberSuffix(String attr, String value, Tags.Generator body) {
        tag(_indexPageNumberSuffix, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-number-suffix} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageNumberSuffix(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexPageNumberSuffix, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexRangeBegin = "fo:index-range-begin".toCharArray();

    /**
     * Create an empty a @code{fo:index-range-begin} tag
     */
    public void indexRangeBegin() {
        tag(_indexRangeBegin, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-range-begin} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexRangeBegin(String attr, String value) {
        tag(_indexRangeBegin, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-range-begin} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexRangeBegin(String attr1, String value1, String attr2, String value2) {
        tag(_indexRangeBegin, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-range-begin} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexRangeBegin(Tags.Generator body) {
        tag(_indexRangeBegin, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-range-begin} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexRangeBegin(String attr, String value, Tags.Generator body) {
        tag(_indexRangeBegin, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-range-begin} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexRangeBegin(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexRangeBegin, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexRangeEnd = "fo:index-range-end".toCharArray();

    /**
     * Create an empty a @code{fo:index-range-end} tag
     */
    public void indexRangeEnd() {
        tag(_indexRangeEnd, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-range-end} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexRangeEnd(String attr, String value) {
        tag(_indexRangeEnd, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-range-end} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexRangeEnd(String attr1, String value1, String attr2, String value2) {
        tag(_indexRangeEnd, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-range-end} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexRangeEnd(Tags.Generator body) {
        tag(_indexRangeEnd, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-range-end} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexRangeEnd(String attr, String value, Tags.Generator body) {
        tag(_indexRangeEnd, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-range-end} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexRangeEnd(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexRangeEnd, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexKeyReference = "fo:index-key-reference".toCharArray();

    /**
     * Create an empty a @code{fo:index-key-reference} tag
     */
    public void indexKeyReference() {
        tag(_indexKeyReference, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-key-reference} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexKeyReference(String attr, String value) {
        tag(_indexKeyReference, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-key-reference} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexKeyReference(String attr1, String value1, String attr2, String value2) {
        tag(_indexKeyReference, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-key-reference} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexKeyReference(Tags.Generator body) {
        tag(_indexKeyReference, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-key-reference} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexKeyReference(String attr, String value, Tags.Generator body) {
        tag(_indexKeyReference, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-key-reference} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexKeyReference(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexKeyReference, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexPageCitationList = "fo:index-page-citation-list".toCharArray();

    /**
     * Create an empty a @code{fo:index-page-citation-list} tag
     */
    public void indexPageCitationList() {
        tag(_indexPageCitationList, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-list} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexPageCitationList(String attr, String value) {
        tag(_indexPageCitationList, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-list} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexPageCitationList(String attr1, String value1, String attr2, String value2) {
        tag(_indexPageCitationList, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-page-citation-list} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexPageCitationList(Tags.Generator body) {
        tag(_indexPageCitationList, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-list} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationList(String attr, String value, Tags.Generator body) {
        tag(_indexPageCitationList, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-list} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationList(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexPageCitationList, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexPageCitationListSeparator = "fo:index-page-citation-list-separator".toCharArray();

    /**
     * Create an empty a @code{fo:index-page-citation-list-separator} tag
     */
    public void indexPageCitationListSeparator() {
        tag(_indexPageCitationListSeparator, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-list-separator} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexPageCitationListSeparator(String attr, String value) {
        tag(_indexPageCitationListSeparator, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-list-separator} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexPageCitationListSeparator(String attr1, String value1, String attr2, String value2) {
        tag(_indexPageCitationListSeparator, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-page-citation-list-separator} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexPageCitationListSeparator(Tags.Generator body) {
        tag(_indexPageCitationListSeparator, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-list-separator} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationListSeparator(String attr, String value, Tags.Generator body) {
        tag(_indexPageCitationListSeparator, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-list-separator} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationListSeparator(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexPageCitationListSeparator, attr1, value1, attr2, value2, body);
    }

    private static final char[] _indexPageCitationRangeSeparator = "fo:index-page-citation-range-separator".toCharArray();

    /**
     * Create an empty a @code{fo:index-page-citation-range-separator} tag
     */
    public void indexPageCitationRangeSeparator() {
        tag(_indexPageCitationRangeSeparator, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-range-separator} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void indexPageCitationRangeSeparator(String attr, String value) {
        tag(_indexPageCitationRangeSeparator, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:index-page-citation-range-separator} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void indexPageCitationRangeSeparator(String attr1, String value1, String attr2, String value2) {
        tag(_indexPageCitationRangeSeparator, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:index-page-citation-range-separator} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void indexPageCitationRangeSeparator(Tags.Generator body) {
        tag(_indexPageCitationRangeSeparator, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-range-separator} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationRangeSeparator(String attr, String value, Tags.Generator body) {
        tag(_indexPageCitationRangeSeparator, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:index-page-citation-range-separator} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void indexPageCitationRangeSeparator(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_indexPageCitationRangeSeparator, attr1, value1, attr2, value2, body);
    }

    private static final char[] _bookmarkTree = "fo:bookmark-tree".toCharArray();

    /**
     * Create an empty a @code{fo:bookmark-tree} tag
     */
    public void bookmarkTree() {
        tag(_bookmarkTree, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark-tree} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void bookmarkTree(String attr, String value) {
        tag(_bookmarkTree, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark-tree} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void bookmarkTree(String attr1, String value1, String attr2, String value2) {
        tag(_bookmarkTree, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:bookmark-tree} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void bookmarkTree(Tags.Generator body) {
        tag(_bookmarkTree, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark-tree} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void bookmarkTree(String attr, String value, Tags.Generator body) {
        tag(_bookmarkTree, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark-tree} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void bookmarkTree(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_bookmarkTree, attr1, value1, attr2, value2, body);
    }

    private static final char[] _bookmark = "fo:bookmark".toCharArray();

    /**
     * Create an empty a @code{fo:bookmark} tag
     */
    public void bookmark() {
        tag(_bookmark, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void bookmark(String attr, String value) {
        tag(_bookmark, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void bookmark(String attr1, String value1, String attr2, String value2) {
        tag(_bookmark, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:bookmark} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void bookmark(Tags.Generator body) {
        tag(_bookmark, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void bookmark(String attr, String value, Tags.Generator body) {
        tag(_bookmark, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void bookmark(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_bookmark, attr1, value1, attr2, value2, body);
    }

    private static final char[] _bookmarkTitle = "fo:bookmark-title".toCharArray();

    /**
     * Create an empty a @code{fo:bookmark-title} tag
     */
    public void bookmarkTitle() {
        tag(_bookmarkTitle, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark-title} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void bookmarkTitle(String attr, String value) {
        tag(_bookmarkTitle, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:bookmark-title} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void bookmarkTitle(String attr1, String value1, String attr2, String value2) {
        tag(_bookmarkTitle, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:bookmark-title} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void bookmarkTitle(Tags.Generator body) {
        tag(_bookmarkTitle, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark-title} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void bookmarkTitle(String attr, String value, Tags.Generator body) {
        tag(_bookmarkTitle, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:bookmark-title} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void bookmarkTitle(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_bookmarkTitle, attr1, value1, attr2, value2, body);
    }

    private static final char[] _float_ = "fo:float_".toCharArray();

    /**
     * Create an empty a @code{fo:float_} tag
     */
    public void float_() {
        tag(_float_, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:float_} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void float_(String attr, String value) {
        tag(_float_, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:float_} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void float_(String attr1, String value1, String attr2, String value2) {
        tag(_float_, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:float_} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void float_(Tags.Generator body) {
        tag(_float_, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:float_} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void float_(String attr, String value, Tags.Generator body) {
        tag(_float_, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:float_} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void float_(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_float_, attr1, value1, attr2, value2, body);
    }

    private static final char[] _footnote = "fo:footnote".toCharArray();

    /**
     * Create an empty a @code{fo:footnote} tag
     */
    public void footnote() {
        tag(_footnote, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:footnote} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void footnote(String attr, String value) {
        tag(_footnote, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:footnote} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void footnote(String attr1, String value1, String attr2, String value2) {
        tag(_footnote, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:footnote} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void footnote(Tags.Generator body) {
        tag(_footnote, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:footnote} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void footnote(String attr, String value, Tags.Generator body) {
        tag(_footnote, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:footnote} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void footnote(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_footnote, attr1, value1, attr2, value2, body);
    }

    private static final char[] _footnoteBody = "fo:footnote-body".toCharArray();

    /**
     * Create an empty a @code{fo:footnote-body} tag
     */
    public void footnoteBody() {
        tag(_footnoteBody, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:footnote-body} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void footnoteBody(String attr, String value) {
        tag(_footnoteBody, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:footnote-body} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void footnoteBody(String attr1, String value1, String attr2, String value2) {
        tag(_footnoteBody, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:footnote-body} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void footnoteBody(Tags.Generator body) {
        tag(_footnoteBody, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:footnote-body} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void footnoteBody(String attr, String value, Tags.Generator body) {
        tag(_footnoteBody, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:footnote-body} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void footnoteBody(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_footnoteBody, attr1, value1, attr2, value2, body);
    }

    private static final char[] _changeBarBegin = "fo:change-bar-begin".toCharArray();

    /**
     * Create an empty a @code{fo:change-bar-begin} tag
     */
    public void changeBarBegin() {
        tag(_changeBarBegin, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:change-bar-begin} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void changeBarBegin(String attr, String value) {
        tag(_changeBarBegin, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:change-bar-begin} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void changeBarBegin(String attr1, String value1, String attr2, String value2) {
        tag(_changeBarBegin, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:change-bar-begin} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void changeBarBegin(Tags.Generator body) {
        tag(_changeBarBegin, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:change-bar-begin} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void changeBarBegin(String attr, String value, Tags.Generator body) {
        tag(_changeBarBegin, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:change-bar-begin} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void changeBarBegin(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_changeBarBegin, attr1, value1, attr2, value2, body);
    }

    private static final char[] _changeBarEnd = "fo:change-bar-end".toCharArray();

    /**
     * Create an empty a @code{fo:change-bar-end} tag
     */
    public void changeBarEnd() {
        tag(_changeBarEnd, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:change-bar-end} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void changeBarEnd(String attr, String value) {
        tag(_changeBarEnd, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:change-bar-end} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void changeBarEnd(String attr1, String value1, String attr2, String value2) {
        tag(_changeBarEnd, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:change-bar-end} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void changeBarEnd(Tags.Generator body) {
        tag(_changeBarEnd, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:change-bar-end} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void changeBarEnd(String attr, String value, Tags.Generator body) {
        tag(_changeBarEnd, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:change-bar-end} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void changeBarEnd(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_changeBarEnd, attr1, value1, attr2, value2, body);
    }

    private static final char[] _wrapper = "fo:wrapper".toCharArray();

    /**
     * Create an empty a @code{fo:wrapper} tag
     */
    public void wrapper() {
        tag(_wrapper, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:wrapper} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void wrapper(String attr, String value) {
        tag(_wrapper, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:wrapper} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void wrapper(String attr1, String value1, String attr2, String value2) {
        tag(_wrapper, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:wrapper} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void wrapper(Tags.Generator body) {
        tag(_wrapper, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:wrapper} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void wrapper(String attr, String value, Tags.Generator body) {
        tag(_wrapper, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:wrapper} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void wrapper(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_wrapper, attr1, value1, attr2, value2, body);
    }

    private static final char[] _marker = "fo:marker".toCharArray();

    /**
     * Create an empty a @code{fo:marker} tag
     */
    public void marker() {
        tag(_marker, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:marker} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void marker(String attr, String value) {
        tag(_marker, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:marker} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void marker(String attr1, String value1, String attr2, String value2) {
        tag(_marker, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:marker} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void marker(Tags.Generator body) {
        tag(_marker, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:marker} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void marker(String attr, String value, Tags.Generator body) {
        tag(_marker, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:marker} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void marker(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_marker, attr1, value1, attr2, value2, body);
    }

    private static final char[] _retrieveMarker = "fo:retrieve-marker".toCharArray();

    /**
     * Create an empty a @code{fo:retrieve-marker} tag
     */
    public void retrieveMarker() {
        tag(_retrieveMarker, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:retrieve-marker} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void retrieveMarker(String attr, String value) {
        tag(_retrieveMarker, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:retrieve-marker} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void retrieveMarker(String attr1, String value1, String attr2, String value2) {
        tag(_retrieveMarker, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:retrieve-marker} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void retrieveMarker(Tags.Generator body) {
        tag(_retrieveMarker, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:retrieve-marker} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void retrieveMarker(String attr, String value, Tags.Generator body) {
        tag(_retrieveMarker, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:retrieve-marker} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void retrieveMarker(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_retrieveMarker, attr1, value1, attr2, value2, body);
    }

    private static final char[] _retrieveTableMarker = "fo:retrieve-table-marker".toCharArray();

    /**
     * Create an empty a @code{fo:retrieve-table-marker} tag
     */
    public void retrieveTableMarker() {
        tag(_retrieveTableMarker, null, null, null, null, null);
    }

    /**
     * Create an empty a @code{fo:retrieve-table-marker} tag
     * @param attr name of the attribute.
     * @param value value of the attribute.
     */
    public void retrieveTableMarker(String attr, String value) {
        tag(_retrieveTableMarker, attr, value, null, null, null);
    }

    /**
     * Create an empty a @code{fo:retrieve-table-marker} tag
     * @param attr1 name of the attribute.
     * @param value1 value of the attribute.
     * @param attr2 name of the attribute.
     * @param value2 value of the attribute.
     */
    public void retrieveTableMarker(String attr1, String value1, String attr2, String value2) {
        tag(_retrieveTableMarker, attr1, value1, attr2, value2, null);
    }

    /**
     * Create a @code{fo:retrieve-table-marker} tag with zero attribute
     * @param body the body generator for the tag.
     */
    public void retrieveTableMarker(Tags.Generator body) {
        tag(_retrieveTableMarker, null, null, null, null, body);
    }

    /**
     * Create a @code{fo:retrieve-table-marker} tag with one attribute
     * @param attr name of the attribute.
     * @param value value of the attribute.
     * @param body the body generator for the tag.
     */
    public void retrieveTableMarker(String attr, String value, Tags.Generator body) {
        tag(_retrieveTableMarker, attr, value, null, null, body);
    }

    /**
     * Create a @code{fo:retrieve-table-marker} tag with one attribute
     * @param attr1 name of the first attribute.
     * @param value1 value of the first attribute.
     * @param attr2 name of the second attribute.
     * @param value2 value of the second attribute.
     * @param body the body generator for the tag.
     */
    public void retrieveTableMarker(String attr1, String value1, String attr2, String value2, Tags.Generator body) {
        tag(_retrieveTableMarker, attr1, value1, attr2, value2, body);
    }


}
