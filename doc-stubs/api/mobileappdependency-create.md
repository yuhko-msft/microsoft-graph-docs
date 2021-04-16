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
|targetDisplayName|String|The target mobile app's display name. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetDisplayVersion|String|The target mobile app's display version. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetId|String|The target mobile app's app id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetPublisher|String|The target mobile app's publisher. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md). Possible values are: `child`, `parent`.|
|dependencyType|mobileAppDependencyType|The type of dependency relationship between the parent and child apps. Possible values are: `detect`, `autoInstall`.|
|dependentAppCount|Int32|The total number of apps that directly or indirectly depend on the parent app.|
|dependsOnAppCount|Int32|The total number of apps the child app directly or indirectly depends on.|



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
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.mobileAppDependency not found
Content-Type: application/json
Content-length: 317

{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
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
  "id": "f14e7cd2-7cd2-f14e-d27c-4ef1d27c4ef1",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer",
  "dependsOnAppCount": "Integer"
}
```

