---
title: "Update mobileContainedApp"
description: "Update the properties of a mobileContainedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileContainedApp
Namespace: microsoft.graph



Update the properties of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/containedApps/{mobileContainedAppId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileContainedApp](../resources/mobilecontainedapp.md) object.

The following table shows the properties that are required when you update the [mobileContainedApp](../resources/mobilecontainedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileContainedApp](../resources/mobilecontainedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobilecontainedapp"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/containedApps/{mobileContainedAppId}
Content-Type: application/json
Content-length: 60

{
  "@odata.type": "#microsoft.graph.mobileContainedApp"
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
  "@odata.type": "#microsoft.graph.mobileContainedApp",
  "id": "86dde4e7-e4e7-86dd-e7e4-dd86e7e4dd86"
}
```

