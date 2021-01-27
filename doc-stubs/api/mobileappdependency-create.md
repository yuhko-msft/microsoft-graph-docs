---
title: "Create mobileAppDependency"
description: "Create a new mobileAppDependency object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppDependency
Namespace: microsoft.graph

Create a new [mobileAppDependency](../resources/mobileappdependency.md) object.

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
POST ** Collection URI for microsoft.graph.mobileAppDependency not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppDependency](../resources/mobileappdependency.md) object.

The following table shows the properties that are required when you create the [mobileAppDependency](../resources/mobileappdependency.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetId|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetDisplayName|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetDisplayVersion|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetPublisher|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md). Possible values are: `child`, `parent`.|
|dependencyType|mobileAppDependencyType|**TODO: Add Description**. Possible values are: `detect`, `autoInstall`.|
|dependentAppCount|Int32|**TODO: Add Description**|
|dependsOnAppCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppDependency](../resources/mobileappdependency.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappdependency_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.mobileAppDependency not found
Content-Type: application/json
Content-length: 317

{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer",
  "dependsOnAppCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppDependency"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "id": "1abbb949-b949-1abb-49b9-bb1a49b9bb1a",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer",
  "dependsOnAppCount": "Integer"
}
```

