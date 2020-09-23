---
title: "Update mobileAppDependency"
description: "Update the properties of a mobileAppDependency object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileAppDependency
Namespace: microsoft.graph

Update the properties of a [mobileAppDependency](../resources/mobileappdependency.md) object.

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
PATCH /mobileAppDependency
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
|id|String|The relationship entity id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetId|String|The target mobile app's app id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetDisplayName|String|The target mobile app's display name. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md). Possible values are: `child`, `parent`.|
|dependencyType|mobileAppDependencyType|The type of dependency relationship between the parent and child apps. Possible values are: `detect`, `autoInstall`.|
|dependentAppCount|Int32|The total number of dependencies the child app has.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppDependency](../resources/mobileappdependency.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileappdependency"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/mobileAppDependency
Content-Type: application/json
Content-length: 213

{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "id": "96761ab1-1ab1-9676-b11a-7696b11a7696",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer"
}
```

