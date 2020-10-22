---
title: "Create relationships"
description: "Create a new mobileAppRelationship object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create relationships
Namespace: microsoft.graph

Create a new mobileAppRelationship object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /deviceAppManagement/mobileApps/{mobileAppId}/relationships
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppRelationship](../resources/intune-mobileapprelationship.md) object.

The following table shows the properties that are required when you create the [mobileAppRelationship](../resources/intune-mobileapprelationship.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetId|String|**TODO: Add Description**|
|targetDisplayName|String|**TODO: Add Description**|
|targetType|mobileAppRelationshipType|**TODO: Add Description**. Possible values are: `child`, `parent`.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppRelationship](../resources/intune-mobileapprelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileapprelationship_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceAppManagement/mobileApps/{mobileAppId}/relationships
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppRelationship"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "id": "310e9977-9977-310e-7799-0e3177990e31",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String"
}
```

