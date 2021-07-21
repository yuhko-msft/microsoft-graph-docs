---
title: "Create applicationTemplate"
description: "Create a new applicationTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create applicationTemplate
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [applicationTemplate](../resources/applicationtemplate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /applicationTemplates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [applicationTemplate](../resources/applicationtemplate.md) object.

The following table shows the properties that are required when you create the [applicationTemplate](../resources/applicationtemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|homePageUrl|String|**TODO: Add Description**|
|logoUrl|String|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|supportedProvisioningTypes|String collection|**TODO: Add Description**|
|supportedSingleSignOnModes|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [applicationTemplate](../resources/applicationtemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_applicationtemplate_from_applicationtemplates"
}
-->
``` http
POST https://graph.microsoft.com/beta/applicationTemplates
Content-Type: application/json
Content-length: 344

{
  "@odata.type": "#microsoft.graph.applicationTemplate",
  "categories": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "homePageUrl": "String",
  "logoUrl": "String",
  "publisher": "String",
  "supportedProvisioningTypes": [
    "String"
  ],
  "supportedSingleSignOnModes": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.applicationTemplate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.applicationTemplate",
  "id": "89f7614d-614d-89f7-4d61-f7894d61f789",
  "categories": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "homePageUrl": "String",
  "logoUrl": "String",
  "publisher": "String",
  "supportedProvisioningTypes": [
    "String"
  ],
  "supportedSingleSignOnModes": [
    "String"
  ]
}
```

