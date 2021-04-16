---
title: "Create groupLifecyclePolicy"
description: "Create a new groupLifecyclePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupLifecyclePolicy
Namespace: microsoft.graph



Create a new [groupLifecyclePolicy](../resources/grouplifecyclepolicy.md) object.

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
POST /groupLifecyclePolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupLifecyclePolicy](../resources/grouplifecyclepolicy.md) object.

The following table shows the properties that are required when you create the [groupLifecyclePolicy](../resources/grouplifecyclepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|alternateNotificationEmails|String|**TODO: Add Description**|
|groupLifetimeInDays|Int32|**TODO: Add Description**|
|managedGroupTypes|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [groupLifecyclePolicy](../resources/grouplifecyclepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouplifecyclepolicy_from_grouplifecyclepolicies"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/groupLifecyclePolicies
Content-Type: application/json
Content-length: 177

{
  "@odata.type": "#microsoft.graph.groupLifecyclePolicy",
  "alternateNotificationEmails": "String",
  "groupLifetimeInDays": "Integer",
  "managedGroupTypes": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupLifecyclePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupLifecyclePolicy",
  "id": "c8fb9783-9783-c8fb-8397-fbc88397fbc8",
  "alternateNotificationEmails": "String",
  "groupLifetimeInDays": "Integer",
  "managedGroupTypes": "String"
}
```

