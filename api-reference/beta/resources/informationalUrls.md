---
title: "informationalurls resource type"
description: "Resources to help configure the application, including documentation and sign-up links."
ms.localizationpriority: medium
doc_type: resourcePageType
ms.prod: "applications"
author: "alamaral"
---

# informationalurls resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Resources to help configure the application, including documentation and sign-up links.

## Properties

| Property | Type | Description |
|:---------------|:--------|:----------|
singleSignOnDocumentationUrl|string|The documentation url to configure single sign-on for the application|No|Yes
appSignUpUrl|string|The url to enroll in the application (only for OIDC and first party applications)|No|Yes

## JSON representation
Here is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.informationalUrl"
}-->

```json
{
  "singleSignOnDocumentationUrl": "String",
  "appSignUpUrl": "String",
}

```


<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "informationalUrls resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->


