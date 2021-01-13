---
title: "accessPackageAssignmentRequest: Cancel"
description: "Cancel accessPackageAssignmentRequest objects that are in a cancellable state: `accepted`, `pendingApproval`, `pendingNotBefore`, `pendingApprovalEscalated`."
localization_priority: Normal
author: "sbounouh"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# accessPackageAssignmentRequest: cancel
Namespace: microsoft.graph

In [Azure AD entitlement management](../resources/entitlementmanagement-root.md), cancel [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) objects that are in a cancellable state: `accepted`, `pendingApproval`, `pendingNotBefore`, `pendingApprovalEscalated`.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|EntitlementManagement.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/FilterByCurrentUser
```

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For example, to retrieve the access package that was requested, include `$expand=accessPackage` in the query. To retrieve the resulting assignment, include `$expand=accessPackageAssignment` in the query.  For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
In the request body, supply a JSON representation of [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.

For a non-administrator user to cancel a request for themselves, the body has to contain the request `id` and `requestStatus`. The value of the **requestStatus** property is `cancelled`, and the **id** property contains the ID of the **accessPackageAssignmentRequest** property identifying the [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md).

## Response

If successful, this function returns a `200 OK` response code.  It does not return anything in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "accesspackageassignmentrequest_cancel"
}
-->
``` http
POST https://graph.microsoft.com/beta/identityGovernance/entitlementManagement/accessPackageAssignmentRequests{id}/cancel
```


### Response
The following is an example of the response.

<!-- {
  "blockType": "response",
  "truncated": true
} -->

```http
HTTP/1.1 204 No Content
```

