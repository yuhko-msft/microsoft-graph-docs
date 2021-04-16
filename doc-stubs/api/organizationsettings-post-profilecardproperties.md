---
title: "Create profileCardProperty"
description: "Create a new profileCardProperty object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create profileCardProperty
Namespace: microsoft.graph



Create a new profileCardProperty object.

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
POST /organization/{organizationId}/settings/profileCardProperties
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [profileCardProperty](../resources/profilecardproperty.md) object.

The following table shows the properties that are required when you create the [profileCardProperty](../resources/profilecardproperty.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|annotations|[profileCardAnnotation](../resources/profilecardannotation.md) collection|**TODO: Add Description**|
|directoryPropertyName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [profileCardProperty](../resources/profilecardproperty.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_profilecardproperty_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/organization/{organizationId}/settings/profileCardProperties
Content-Type: application/json
Content-length: 201

{
  "@odata.type": "#microsoft.graph.profileCardProperty",
  "annotations": [
    {
      "@odata.type": "microsoft.graph.profileCardAnnotation"
    }
  ],
  "directoryPropertyName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.profileCardProperty"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.profileCardProperty",
  "id": "b7a19a81-9a81-b7a1-819a-a1b7819aa1b7",
  "annotations": [
    {
      "@odata.type": "microsoft.graph.profileCardAnnotation"
    }
  ],
  "directoryPropertyName": "String"
}
```

